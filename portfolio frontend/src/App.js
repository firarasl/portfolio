import React, { Component } from 'react';
import $ from 'jquery';
import './App.css';
import Header from './Components/Header';
import Footer from './Components/Footer';
import About from './Components/About';
import Resume from './Components/Resume';
import CV from './Components/CV';

import Contact from './Components/Contact';
import Testimonials from './Components/Testimonials';
import Portfolio from './Components/Portfolio';

class App extends Component {

  constructor(props){
    super(props);
    this.state = {
      foo: 'bar',
      resumeData: {},
      phoneNumbers:{},
      education:[],
      experience:[]
    };

   // ReactGA.initialize('UA-110570651-1');
  //  ReactGA.pageview(window.location.pathname);

  }

  getResumeData(){
    $.ajax({
      url:'http://localhost:8080/',
      dataType:'json',
      cache: false,
      success: function(data){
        this.setState({resumeData: data});
      }.bind(this),
      error: function(xhr, status, err){
        console.log(err);
        alert(err);
      }
    });
  }
  getPhoneNumbers(){
    $.ajax({
      url:'http://localhost:8080/get-phonenumber',
      dataType:'json',
      cache: false,
      success: function(data){
        this.setState({phoneNumbers: data});
      }.bind(this),
      error: function(xhr, status, err){
        console.log(err);
        alert(err);
      }
    });
  }

  getEducation(){
    $.ajax({
      url:'http://localhost:8080/get-education',
      dataType:'json',
      cache: false,
      success: function(data){
        this.setState({education: data});
      }.bind(this),
      error: function(xhr, status, err){
        console.log(err);
        alert(err);
      }
    });
  }

  getExperience(){
    $.ajax({
      url:'http://localhost:8080/get-experience',
      dataType:'json',
      cache: false,
      success: function(data){
        this.setState({experience: data});
      }.bind(this),
      error: function(xhr, status, err){
        console.log(err);
        alert(err);
      }
    });
  }
  componentDidMount(){
    this.getResumeData();
    this.getEducation();
    this.getExperience();
    this.getPhoneNumbers();
  }

  render() {
    return (
      <div className="App">
        <Header data={this.state.experience} data1={this.state.phoneNumbers} data2={this.state.education} data3={this.state.resumeData}/>
        <About data={this.state.experience} data1={this.state.phoneNumbers} data2={this.state.education} data3={this.state.resumeData}/>
        <Resume data={this.state.experience} data1={this.state.phoneNumbers} data2={this.state.education} data3={this.state.resumeData}/>
        <CV/>
        <Footer data={this.state.resumeData.main}/>
      </div>
    );
  }
}

export default App;
