require 'rubygems' # not necessary with ruby 1.9 but included for completeness
require 'twilio-ruby'

# put your own credentials here
account_sid = 'ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX'
auth_token = 'your_auth_token'

# set up a client to talk to the Twilio REST API
@client = Twilio::REST::Client.new(account_sid, auth_token)

# Loop over ip_addresss and print out a property for each one
@client.sip
       .ip_access_control_lists('AL32a3c49700934481addd5ce1659f04d2')
       .ip_addresses.list.each do |ip_address|
         puts ip_address.friendly_name
       end
