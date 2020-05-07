import React, { Component } from 'react';

class About extends Component {
  render() {

    if(this.props.data){
      var name = this.props.data3.name;
      var surname=this.props.data3.surname;
      var email = this.props.data3.email;
      var bio = this.props.data3.bio;
      var birthdate = this.props.data3.birthdate;
//var birthdateMOD=new Date(birthdate).toISOString().split('T')[0];
var data=new Date(birthdate).toDateString().split('T')[0];
      if(this.props.data1[0] != undefined)
      var phone=this.props.data1[0].value;
      if(this.props.data3.country != undefined){
          var country = this.props.data3.country.countryname;
}

    //  var profilepic= "images/"+this.props.data.image;
//            <img className="profile-pic"  src={profilepic} alt="Tim Baker Profile Pic" />

    }

    return (
      <section id="about">
      <div className="row">
         <div className="three columns">
         <img className="profile-pic"  src="images/profile.jpg" alt="Profile Pic" />
         </div>
         <div className="nine columns main-col">
            <h2>About Me</h2>

            <p>Here's brief information about me. :-) </p>
            <div className="row">
               <div className="columns contact-details">
                  <h2>Contact Details</h2>
                  <p className="address">
                  Name:  <span> {name} {surname}</span><br />
                  Birthdate:  <span>{data}</span><br />
                  Country:  <span>{country}</span><br />
                  Email:   <span>{email}</span><br/>
                  Mobile:   <span>{phone}</span><br/>
					   </p>
               </div>
      
            </div>
         </div>
      </div>

   </section>
    );
  }
}

export default About;
