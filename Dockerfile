FROM maven:3.3.9
RUN git clone https://github.com/jobosk/ms-server.git /data/app
WORKDIR /data/app
CMD [ "mvn clean install spring-boot:run" ]