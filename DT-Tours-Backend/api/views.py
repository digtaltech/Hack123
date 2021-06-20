from django.shortcuts import render
from rest_framework import viewsets, generics
from .models import Tour
from django.contrib.auth.models import User
from .serializer import UserSerializer, TourSerializer
from rest_framework import permissions
from .permissions import IsOwnerOrReadOnly
from rest_framework.decorators import api_view

# Create your views here.
# @api_view(['GET', 'POST'])
class UserViewSet(viewsets.ModelViewSet):
    serializer_class = UserSerializer
    def get_queryset(self):
        queryset = User.objects.all()
        return queryset
    permission_classes = [permissions.IsAuthenticatedOrReadOnly,
                          IsOwnerOrReadOnly]

class TourViewSet(viewsets.ModelViewSet):

    serializer_class = TourSerializer
    def get_queryset(self):

        user = self.request.user
        queryset = Tour.objects.filter(username=user)
        return queryset

    def perform_create(self, serializer):
        serializer.save(username=self.request.user)

    permission_classes = [permissions.IsAuthenticatedOrReadOnly,
                          IsOwnerOrReadOnly]



# class UserDetail(generics.RetrieveAPIView):
#     queryset = User.objects.all()
#     serializer_class = UserSerializer


# class NotesList(generics.ListAPIView):
#     serializer_class = NotesSerializer
#
#     def get_queryset(self):
#
#         user = self.request.user
#         return Notes.objects.filter(username=user)
