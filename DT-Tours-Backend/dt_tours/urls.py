from django.contrib import admin
from django.conf.urls import url, include
from django.contrib.auth.models import User
from rest_framework import routers, serializers, viewsets
from django.urls import path
from api.views import UserViewSet, TourViewSet
from rest_framework.authtoken.views import obtain_auth_token
from api import views

router = routers.DefaultRouter()

router.register('users', UserViewSet, basename='user')
# router.register('register', registration_view, basename='User')
router.register('tours', TourViewSet, basename='tour')

urlpatterns = [
    path('', include(router.urls)),
    path('admin/', admin.site.urls),
    path('api-auth', include('rest_framework.urls', namespace='rest_framework')),
    path('login', obtain_auth_token, name="login"),
    # path('register', registration_view, name="register"),
    # path('users/', views.UserViewSet.as_view()),
    # path('users/<int:pk>/', views.UserDetail.as_view()),
    # url(r'^rest-auth/registration/', include('rest_auth.registration.urls')),
]
