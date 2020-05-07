import React, { Component } from 'react';

class Header extends Component {
  render() {

    if(this.props.data){
      var name = this.props.data3.name;
      var surname = this.props.data3.surname;
      var description= this.props.data3.bio;
      if(this.props.data3.country != undefined){
         var country= this.props.data3.country.countryname;
      }
      if(this.props.data[0] != undefined){
      var experience= this.props.data[0].position;
      }
    }

    return (
      <header id="home">

      <nav id="nav-wrap">

         <a className="mobile-btn" href="#nav-wrap" title="Show navigation">Show navigation</a>
	      <a className="mobile-btn" href="#home" title="Hide navigation">Hide navigation</a>

         <ul id="nav" className="nav">
            <li className="current"><a className="smoothscroll" href="#home">Home</a></li>
            <li><a className="smoothscroll" href="#about">About</a></li>
	         <li><a className="smoothscroll" href="#resume">Resume</a></li>
            <li><a className="smoothscroll" href="#cv">Download my CV</a></li>
         </ul>

      </nav>

      <div className="row banner">
         <div className="banner-text"> 
         <h3><span>{description}.</span></h3>
            <h1 className="responsive-headline">I'm {name} {surname}.</h1>
            <h3><span>I'm a {country} based {experience}</span>.</h3>
            <hr />
            <ul className="social">
            <li>
               <a href="https://github.com/firarasl?tab=repositories" target="_blank">
                  <i className="fa fa-github" data-toggle="tooltip" data-placement="top" title="My Github">
                     </i>
                     </a>
                     </li>
                      <li>
               <a href="https://www.linkedin.com/in/firangiz-rasulova-221a30194/" target="_blank">
                  <i className="fa fa-linkedin" data-toggle="tooltip" data-placement="top" title="My Linkedin">
                     </i>
                     </a>
                     </li>
            <li>
               <a href="https://gitlab.com/firangiz" target="_blank">
                  <i className="fa fa-github" data-toggle="tooltip" data-placement="top" title="My GitLab">
                     </i>
                     </a>
                     </li>
           
            </ul>
         </div>
      </div>

      <p className="scrolldown">
         <a className="smoothscroll" href="#about"><i className="icon-down-circle"></i></a>
      </p>

   </header>
    );
  }
}

export default Header;
