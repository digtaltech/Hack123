<template id="">
  <div class="popupWrapper">
    <div сlass="popup">

      <div class="popupSwitcher" style="background: #ffffff; border-radius: 15px 15px 0 0;">
        <button type="button" style="font-size: 25px; font-weight: 600; text-decoration: none; margin-bottom: 1rem; margin-top: 1rem; color:#283E59" class="btn btn-link mx-2">Карта</button>
        <button type="button" style="font-size: 25px; font-weight: 600; text-decoration: none; margin-bottom: 1rem; margin-top: 1rem; color:#283E59" class="btn btn-link mx-2" @click="isListVisible">Список</button>
      </div>

      <div class="card cardPopup">
        <div>
          <button type="button" style="color: #ffffff; font-size: 20px; text-decoration: none; margin-bottom: 2rem" class="btn btn-link mx-2" @click="isClosePopup">Назад</button>
          <div style="text-align: center; color: #ffffff; margin-bottom: 2rem">
            <h1>Новое событие</h1>
          </div>
          <div style="margin-right: 3rem; margin-left: 3rem; margin-bottom: 10rem;">
            <h4 style="margin-bottom: 1rem; color: #ffffff; font-weight: 400;">Название</h4>
            <input style="margin-bottom: 2rem" type="text" class="form-control" placeholder="Посещение зоопарка...">
            <h4 style="margin-bottom: 1rem; color: #ffffff; font-weight: 400;">Время посещения</h4>
            <input style="margin-bottom: 2rem" type="text" class="form-control" placeholder="Указать">
            <h4 style="margin-bottom: 1rem; color: #ffffff; font-weight: 400;">Место</h4>
            <input type="text" class="form-control" placeholder="Выбрать на карте">
          </div>
          <div style="text-align: center;">
            <button type="button" style="background-color: #283E59; font-weight: 200; font-size: 22px" class="btn btn-primary btn-lg" @click="isClosePopup">Сохранить</button>
          </div>
        </div>
        <div>
          <iframe style="height: 100%; width:100%" src="https://yandex.ru/map-widget/v1/?um=constructor%3A9befa2af87a1846ff2065b8f238eb1ba96ee9b9ad9333bf979e0476624260ccb&amp;source=constructor" width="464" height="398" frameborder="0"></iframe>
        </div>
      </div>

      <componentsList v-if="isComponentsList" @isCloseList="isCloseList"></componentsList>

    </div>
  </div>
</template>
<script>
import componentsList from './componentsList'

export default {
  name: "componentsPopup",

  components: {
    componentsList
  },
  data(){
    return{
      isComponentsList: false,
    }
  },
  methods: {
    isClosePopup(){
      this.$emit('isClosePopup')
    },
    isListVisible(){
      this.isComponentsList = true;
    },
    isCloseList(){
      this.isComponentsList = false;
    },
  },
}
</script>
<style>
.popupWrapper{
  background: rgba(64,64,64, .4);
  display: flex;
  justify-content: center;
  align-items: center;
  position: absolute;
  right: 0;
  left: 0;
  top: 0;
  bottom: 0;
}
.cardPopup{
  display: grid;
  grid-template-columns: 35fr 65fr ;
  height: 50rem;
  width: 80rem;
  background: linear-gradient(to left, #F9F9F9 65%, #2C7BE5 35%);
}
.popupSwitcher {
  display: flex;
  justify-content: center;
  align-items: center;
}
</style>
