FROM maven:3.3.9
WORKDIR /data/app
RUN git clone https://github.com/jobosk/ms-server.git
CMD [ "mvn clean install spring-boot:run" ]