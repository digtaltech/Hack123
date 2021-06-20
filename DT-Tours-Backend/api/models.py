from django.db import models

# Create your models here.
from django.conf import settings
from django.db.models.signals import post_save
from django.dispatch import receiver
from rest_framework.authtoken.models import Token

class Place(models.Model):
    day = models.ForeignKey('api.Day', related_name='places', on_delete=models.CASCADE) # Юзер которому принадлежит тур FK
    title = models.TextField(max_length=200) # Название text
    time = models.TimeField() # Время посещения time
    lat = models.TextField(max_length=200) # Координата x
    lon = models.TextField(max_length=200) # Координата y

class Day(models.Model):
    tour = models.ForeignKey('api.Tour', related_name='days', on_delete=models.CASCADE) # Юзер которому принадлежит тур FK
    placeCount = models.IntegerField() # Кол-во мест для посещения int
    title = models.TextField(max_length=200) # Название text
class Tour(models.Model):
    username = models.ForeignKey('auth.User', related_name='tours', on_delete=models.CASCADE) # Юзер которому принадлежит тур FK
    # place = models.ForeignKey(Place, related_name='places', on_delete=models.CASCADE)
    title = models.TextField(max_length=200) # Название text
    body = models.TextField(max_length=500) # Описание text
    dayCount = models.IntegerField() # Кол-во дней int
    departureCity = models.TextField(max_length=200) # Город отправки text
    arrivalCity = models.TextField(max_length=200) # Город прибытия text
    departureDate = models.DateField(max_length=200) # Дата отправки date
    arrivalDate = models.DateField(max_length=200) # Дата прибытия date

@receiver(post_save, sender=settings.AUTH_USER_MODEL)
def create_auth_token(sender, instance=None, created=False, **kwargs):
    if created:
        Token.objects.create(user=instance)
