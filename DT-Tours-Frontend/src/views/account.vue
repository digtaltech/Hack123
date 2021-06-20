<template>
  <div class="account">
    <div class="box1 mx-2 my-2">
      <div class="card">
        <div class="card-header">
          Профиль
        </div>
        <div class="card-body">
          <div style="text-align:center; margin-top: 2rem">
            <img style="border-radius: 200px; height:150px; width:150px" src="https://www.meme-arsenal.com/memes/825b9b3ef148fbf2b20f47951e170699.jpg" alt="">
            <h4 class="card-title" style="margin-top: 1rem">Иванов Иван</h4>
          </div>
          <div style="margin-left: 2rem; margin-right:2rem; margin-top: 3rem">
            <div class="row">
              <div class="col">
                <b>Статус</b>
              </div>
              <div class="col" style="text-align: right">
                Турист
              </div>
            </div>
            <hr>
            <div class="row" style="margin-top: 1rem">
              <div class="col">
                <b>Валюта</b>
              </div>
              <div class="col" style="text-align: right">
                RUB
              </div>
            </div>
            <hr>
            <div class="row" style="margin-top: 1rem">
              <div class="col">
                <b>Язык</b>
              </div>
              <div class="col" style="text-align: right">
                Русский
              </div>
            </div>

            <div class="row" style="margin-top: 3rem">
              <div class="col">
                <b></b>
              </div>
              <div class="col" style="text-align: right">
                <button type="button" class="btn btn-primary">Изменить</button>
              </div>
            </div>
          </div>
        </div>
      </div>
    </div>
    <div class="box2 mx-2 my-2">
      <div class="card" style="height: 100%">
        <div class="card-header">
          Интересы
        </div>
        <div class="card-body cardFlex">
          <div style="text-align:center;">
            <img src="../assets/DonutChart.svg" alt="" style="margin-bottom: 2rem">
            <h5>Информация заполнена на 70%</h5>
            <p>Расскажите нам о себе, чтобы мы могли подобрать вам идеальный тур</p>
            <button type="button" class="btn btn-primary">Дополнить информацию</button>
          </div>
        </div>
      </div>
    </div>
    <div class="box3 mx-2 my-2">
      <div class="card">
        <div class="card-header">
          Помощь
        </div>
        <div class="card-body">
          <div class="row">
            <div class="col-5">
              <p>Частые вопросы</p>
              <hr>
              <p>Обратная связь</p>
              <hr>
              <p>Обращения</p>
              <hr>
              <p>Позвонить в поддержку</p>
            </div>
            <div class="col-7 LogoBeta">
              <img src="../assets/111.svg" alt="">

            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
</template>

<script>

export default {
  name: 'account',
  components: {
  }
}
</script>
<style>
.account{
  margin-left: 15rem;
  margin-right: 15rem;
  display: grid;
  grid-template-columns: 2fr 3fr;
}
.box3{
  grid-column-start: 1;
  grid-column-end: 3;
}
.LogoBeta{
  display: flex;
  justify-content: center;
  align-items: center;
}
.cardFlex{
  display: flex;
  justify-content: center;
  align-items: center;
  height: 100%;
}
</style>
