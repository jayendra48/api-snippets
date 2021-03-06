// NOTE: This example uses the next generation Twilio helper library - for more
// information on how to download and install this version, visit
// https://www.twilio.com/docs/libraries/node
const accountSid = 'ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX';
const authToken = 'your_auth_token';
const Twilio = require('twilio');

const client = new Twilio(accountSid, authToken);

const service = client.notify.services('ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX');

service.notifications
  .create({
    identity: '00000001',
    title: 'Generic loooooooong title for all Bindings',
    data: { custom_key1: 'custom value 1', custom_key2: 'custom value 2' },
    body: 'This is the body for all Bindings',
    fcm: { notification: { title: 'New alert', body: 'Hello Bob!' } },
    apn: { aps: { alert: { title: 'New alert.', body: 'Hello Bob!' } } },
  })
  .then(notification => {
    console.log(notification);
  })
  .catch(error => console.log(error));
