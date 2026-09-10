const menu=document.getElementById("menuToggle");
const nav=document.getElementById("nav");

menu.onclick=()=>{
  nav.classList.toggle("open");
};

document.querySelectorAll("nav a").forEach(link=>{
  link.onclick=()=>{
    nav.classList.remove("open");
  };
});


const projects={
  pharmacy:{
    title:"Pharmacy Management System",
    text:"A management system developed to handle pharmacy operations such as sales, inventory, supplier management, billing and stock tracking."
  },

  dwanikosh:{
    title:"Dwanikosh",
    text:"A MERN-stack music player application developed during my WebStack Academy internship with authentication and personal library features."
  },

  banking:{
    title:"Banking System",
    text:"A Java and JDBC based project created to practice object-oriented programming and database connectivity."
  }
};


const modal=document.getElementById("projectModal");
const modalTitle=document.getElementById("modalTitle");
const modalDescription=document.getElementById("modalDescription");

document.querySelectorAll(".details-button").forEach(button=>{

  button.onclick=()=>{
    const project=projects[button.dataset.project];

    modalTitle.textContent=project.title;
    modalDescription.textContent=project.text;

    modal.classList.add("show");
  };

});


document.getElementById("modalClose").onclick=()=>{
  modal.classList.remove("show");
};

modal.onclick=e=>{
  if(e.target===modal){
    modal.classList.remove("show");
  }
};


document.getElementById("contactForm").onsubmit=e=>{

  e.preventDefault();

  const inputs=e.target.querySelectorAll("input,textarea");

  const message={
    name:inputs[0].value,
    email:inputs[1].value,
    text:inputs[2].value,
    date:new Date().toLocaleString()
  };

  localStorage.setItem(
    "contactMessage",
    JSON.stringify(message)
  );

  document.getElementById("formStatus").textContent=
    "Message saved successfully.";

  e.target.reset();
};