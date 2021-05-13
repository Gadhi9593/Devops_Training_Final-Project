FROM ubuntu
RUN apt-get update -y
ENV DEBIAN_FRONTEND=noninteractive
RUN apt-get install -y php libapache2-mod-php
RUN apt-get install -y apache2
RUN apt-get install -y git
RUN apt-get update -y
EXPOSE 80
WORKDIR /usr/sbin
CMD ["apachectl", "-D", "FOREGROUND"]
