<template>
  <div class="PlanningPage">
    <div class="fr1">
        <div class="card" style="height: 50rem">
          <div style="text-align:center">
           <img src="../assets/edit-file 1.svg" style="margin-top: 2rem; height: 70px; width: 70px" alt="DT TOUR">
         </div>
          <h1 style="text-align: center; margin-top: 2rem; margin-bottom: 5rem; font-size: 50px">Настроим путешествие</h1>
          <div style="margin-right: 8rem; margin-left: 8rem;">
              <h4 style="margin-bottom: 2rem">Название вашего путешествия</h4>
              <input style="margin-bottom: 3rem; padding: 12px; font-size: 20px" type="text" class="form-control" placeholder="Поездка в Сочи">
              <h4 style="margin-bottom: 2rem">Укажите ваше направление</h4>
              <div class="row" style="margin-bottom: 3rem">
                <div class="col">
                  <div class="input-group mr-4">
                    <input type="text" placeholder="Откуда" class="form-control mr-2">
                    <input type="text" placeholder="Куда" class="form-control">
                  </div>
                </div>
                <div class="col">
                  <div class="input-group" >
                    <!-- <input type="text" placeholder="Туда" class="form-control mr-2"> -->
                    <date-picker
                      v-model="value1"
                      format="YYYY-MM-DD"
                      type="date"
                      placeholder="Туда"
                    ></date-picker>
                    <!-- <input type="text" placeholder="Обратно" class="form-control"> -->
                    <date-picker
                      v-model="value2"
                      format="YYYY-MM-DD"
                      type="date"
                      placeholder="Обратно"
                    ></date-picker>
                  </div>
                </div>
              </div>
              <div class="row" style="margin-top: 10rem">
                <div class="col">
                  <button type="button" class="btn btn-link" style="font-size: 22px; text-decoration: none">Отменить</button>
                </div>
                <div class="col" style="text-align: right;">
                  <router-link to="/CustomizationPage"><button type="button" class="btn btn-primary btn-lg">Следующий шаг</button></router-link>
                </div>
              </div>
          </div>
        </div>
    </div>
    <div class="fr2">
      <componentsSettings></componentsSettings>
    </div>
  </div>
</template>

<script>
import DatePicker from 'vue2-datepicker';
import 'vue2-datepicker/index.css';

import componentsSettings from '../components/componentsSettings'

export default {
  name: 'PlanningPage',
  components: {
    componentsSettings,
    DatePicker
  },
  data(){
    return{
      date: new Date(),
      value1: [new Date(2021, 6, 20), new Date(2021, 6, 20)],
      value2: [new Date(2021, 6, 21), new Date(2021, 6, 21)],
    }
  },
  methods: {

  },
}
</script>

<style>
.PlanningPage{
  margin-left: 15rem;
  display: grid;
  grid-template-columns: 5fr 2fr;
}
</style>
