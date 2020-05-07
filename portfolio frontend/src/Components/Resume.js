import React, { Component } from 'react';

class Resume extends Component {

   renderEducation(education) {
      return education.map(ed =>  (
         <div key={ed.id}><h3>{ed.type}</h3>
         <p className="info"><span>&bull;</span>
        <em className="date">
        {new Date((ed.startingDate)).toISOString().split('T')[0]} - {new Date((ed.endingDate)).toISOString().split('T')[0]}
        </em></p>
         <p className="info">{ed.faculty !=null ? ed.faculty.title +' at' :''}  {ed.facility.name}
         </p>
      </div>
          )
      )
  }
  renderExperience(experience) {
   return experience.map(ex =>  (
      <div key={ex.id}><h3>{ex.company}</h3>
      <p className="info"> <span>&bull;</span> {ex.position}
      </p>
   </div>
       )
   )
}



  render() {

    if(this.props.data2 != undefined){
       var education = this.renderEducation(this.props.data2);
    }
    if(this.props.data != undefined){
      var work = this.renderExperience(this.props.data);
   }
    return (
      <section id="resume">

      <div className="row education">
         <div className="three columns header-col">
            <h1><span>Education</span></h1>
         </div>

         <div className="nine columns main-col">
            <div className="row item">
               <div className="twelve columns">
                 {education}
               </div>
            </div>
         </div>
      </div>

      <div className="row work">

         <div className="three columns header-col">
            <h1><span>Work</span></h1>
         </div>

         <div className="nine columns main-col">
          {work}
        </div>
    </div>
   </section>
    );
  }
}

export default Resume;
