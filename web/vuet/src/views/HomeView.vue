<template>
    <div>
    <el-select v-model="value" placeholder="请选择" id="seletyle">
      <el-option
          v-for="item in options"
          :key="item.value"
          :label="item.label"
          :value="item.value"
          :disabled="item.disabled">
      </el-option>
    </el-select>
      <el-input id="inyle"></el-input>
      <el-button type="primary" icon="el-icon-search" id="buttyle">搜索</el-button>
    <div id="dayle">
      <template>
        <el-table
            :data="tableData"
            style="width: 100%">
          <el-table-column
              label="id"
              width="80">
            <template slot-scope="scope">
              <i class="el-icon-time"></i>
              <span style="margin-left: 10px">{{ scope.row.date }}</span>
            </template>
          </el-table-column>
          <el-table-column
              label="课程名"
              width="80">
            <template slot-scope="scope">
              <el-popover trigger="hover" placement="top">
                <p>姓名: {{ scope.row.id }}</p>
                <p>住址: {{ scope.row.address }}</p>
                <div slot="reference" class="name-wrapper">
                  <el-tag size="medium">{{ scope.row.name }}</el-tag>
                </div>
              </el-popover>
            </template>
          </el-table-column>
          <el-table-column
              label="课时"
              width="80">
            <template slot-scope="scope">
              <el-popover trigger="hover" placement="top">
                <p>姓名: {{ scope.row.name }}</p>
                <p>住址: {{ scope.row.address }}</p>
                <div slot="reference" class="name-wrapper">
                  <el-tag size="medium">{{ scope.row.name }}</el-tag>
                </div>
              </el-popover>
            </template>
          </el-table-column>
          <el-table-column
              label="开课学院"
              width="80">
            <template slot-scope="scope">
              <el-popover trigger="hover" placement="top">
                <p>姓名: {{ scope.row.name }}</p>
                <p>住址: {{ scope.row.address }}</p>
                <div slot="reference" class="name-wrapper">
                  <el-tag size="medium">{{ scope.row.name }}</el-tag>
                </div>
              </el-popover>
            </template>
          </el-table-column>
          <el-table-column label="操作">
            <template slot-scope="scope">
              <el-button
                  size="mini"
                  @click="handleEdit(scope.$index, scope.row)">编辑</el-button>
              <el-button
                  size="mini"
                  type="danger"
                  @click="handleDelete(scope.$index, scope.row)">删除</el-button>
            </template>
          </el-table-column>
        </el-table>
      </template>
    </div>
  </div>

</template>
<script>

import axios from "axios";

export default {
  data() {
    return {
      tableData: [{
        id: '1',
        name: 'C语⾔程序设计',
        hours: '70',
        schoolname: '计算机学院'
      }, {
        id: '2',
        name: 'Python程序设计',
        hours: '70',
        schoolname: '计算机学院'
      }, {
        id: '3',
        name: '⼤学英语',
        hours: '96',
        schoolname: '外国语学院'
      }, {
        id: '4',
        name: '⾼级Web技术',
        hours: '56',
        schoolname: '计算机学院'
      }]
      , options: [{
        value: '选项1',
        label: 'ID'
      }, {
        value: '选项2',
        label: '课程名',
      }, {
        value: '选项3',
        label: '学时'
      }, {
        value: '选项4',
        label: '开课学院'
      }],
      value: ''
    }
  }
  // created() {
  //   fetch("http://localhost:9090/user/seemassage").then(res => res.json()).then(res =>{
  //     console.log(res);
  //     this.tableData=res.data;
  //     console.log(this.tableData);
  //   })
    // let self = this;
    // axios({
    //   method: 'get',
    //   url: 'http://localhost:9090/user/seemassage'
    // }).then(res => {
    //   // this.tableData = res;
    //   console.log(res.data);
    //   self.tableData = JSON.parse(JSON.stringify(res.data));
    //   console.log(self.tableData);
    // }).catch(function (err) {
    //   console.log(err);
    // })
    // this.data = self.message;
    // console.log(self);
  // }
  ,methods: {
    handleEdit(index, row) {
      //console.log(index, row);
    },
    handleDelete(index, row) {
      //console.log(index, row);
    }
  }
}

</script>
