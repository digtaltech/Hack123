<template id="">
  <div class="listWrapper">
    <div class="card cardList">
      <div class="row" style="margin-right: 2rem; margin-left: 2rem; margin-top: 2rem">
        <div class="col-2">
          <button type="button" style=" color: #ffffff; font-size: 20px; text-decoration: none;" class="btn btn-link" @click="isCloseList">Назад</button>
        </div>
        <div class="col-10">
          <div class="input-group" style="height: 41px;">
            <input type="text" class="form-control" style="" placeholder="Поиск">
          </div>
        </div>
      </div>
      <div class="btnGroupOnList" style="display:inline-block">
        <button type="button" style="background-color: #283E59; border-radius: 30px; font-size: 23px" class="btn btn-primary mx-2" @click="openRec">  Погулять  </button>
        <button type="button" style="background-color: #E3EBF6; color:#95AAC9;border-radius: 30px; font-size: 23px" class="btn btn-primary mx-2" @click="openView">  Посмотреть  </button>
        <button type="button" style="background-color: #E3EBF6; color:#95AAC9 ;border-radius: 30px; font-size: 23px" class="btn btn-primary mx-2">  Поесть  </button>
        <button type="button" style="background-color: #E3EBF6; color:#95AAC9 ;border-radius: 30px; font-size: 23px" class="btn btn-primary mx-2">  Шопинг  </button>
        <button type="button" style="background-color: #E3EBF6; color:#95AAC9 ;border-radius: 30px; font-size: 23px" class="btn btn-primary mx-2">  Развлечения  </button>
        <button type="button" style="background-color: #E3EBF6; color:#95AAC9 ;border-radius: 30px; font-size: 23px" class="btn btn-primary mx-2">  Афиша  </button>
      </div>

      <div style="margin-right: 5rem; margin-left: 5rem; margin-top: 3rem;">
        <div v-if="isComponentsListRec">
          <componentsListRec :tour_data="tour" v-for="tour in TOURS_REC" :key="tour.day" @addToCartRec="addToCartRec"></componentsListRec>
        </div>
        <div v-if="!isComponentsListRec">
          <componentsListView  :tourView_data="tourView" v-for="tourView in TOURS_VIEW" :key="tourView.day"></componentsListView>
        </div>
      </div>

    </div>
  </div>
</template>
<script>
import componentsListRec from './componentsListRec'
import componentsListView from './componentsListView'
import {mapGetters, mapActions} from 'vuex'

export default {
  name: "componentsList",

  components: {
    componentsListRec,
    componentsListView
  },
  data(){
    return{
      isComponentsListRec: true,
    }
  },
  computed: {
    ...mapGetters([
      'TOURS_REC',
      'TOURS_VIEW'
    ]),
  },
  methods: {
    ...mapActions([
      'ADD_TO_CART'
    ]),
    isCloseList(){
      this.$emit('isCloseList')
      this.isComponentsList = false;
    },
    openRec(){
      this.isComponentsListRec = true;
    },
    openView(){
      this.isComponentsListRec = false;
    },
    addToCartRec(data){
      this.ADD_TO_CART(data)
    }
  }
}
</script>
<style>
.listWrapper{
  display: flex;
  justify-content: center;
  align-items: center;
  position: absolute;
  right: 0;
  left: 0;
  top: 0;
  bottom: 0;
}
.cardList{
  height: 51rem;
  width: 80rem;
  margin-top: 5rem;
  background: #2C7BE5;
}
.btnGroupOnList{
  text-align: center;
  margin-top: 2rem;
}
</style>
