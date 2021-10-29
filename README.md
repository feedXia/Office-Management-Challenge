# Office management challenge | Java

## About

Language: Java

The goal of this project is to build an application that manages the meeting erooms at an office.

This project was done for the Makers Academy Bootcamp Week 8 Individual Challenge.

Project completed independently.

## User Stories

```text
As a staff member
In order to distinguish between meeting rooms
I would like my meeting room to have a name
```

```text
As an office manager
So that staff can coordinate meetings
I would like to add a meeting room to the office
```

```text
As an office manager
So that I can manage meeting rooms
I would like to list all the meeting rooms in the office
```

```text
As a staff member
In order to have meeting,
I would like to check if the meeting room is available or not (true or false)
```

```text
As a staff member
In order to have a meeting,
I would like to be able to enter the meeting room and this should make it unavailable
```

```text
As a staff member
In order to end a meeting
I would like to be able to leave the meeting room and this should make it available again
```

```text
As a staff member
So that I can see where to have my meeting
I would like to be able to see a list of available rooms in the office
```

```text
As a staff member
So that I can avoid interrupting a meeting
I would like an error if I try to use a room that has already been entered
```

### Stretch user stories

```text
As an office manager
So that I can find out when a room becomes available
I would like to receive a text message whenever a meeting room becomes available again
```

```text
As an office manager
So that I can have visibility of how the rooms are being used
I would like to see the name of the meeting and the name of the team that is using the room
```

- Hints on stretch functionality to implement:
- The text sending functionality should be implemented using [Twilio API](https://www.twilio.com/docs/usage/api). You'll need to register for it. It’s free.
- Try and make use of mocks and/or stubs so that actual texts don't get sent when your tests are run
- However, if your code is loaded into IRB the text should actually be sent
- Note that you can only send texts in the same country as you have your account. I.e. if you have a UK account you can only send to UK numbers.

> :warning: **WARNING:** think twice before you push your **mobile number** or **Twilio API Key** to a public space like GitHub :eyes:
>
> :key: Now is a great time to think about security and how you can keep your private information secret. You might want to explore environment variables.

### Code Review

In code review we'll be hoping to see:

- All tests passing
- High [Test coverage](https://github.com/makersacademy/course/blob/master/pills/test_coverage.md) (>95% is good)
- The code is elegant: every class has a clear responsibility, methods are short etc.
- Commits are regular and scoped

## Project To Do's

### Main

- [x] Each meeting room has a distinct name
- [x] Add a meeting room to the office
- [x] List all meeting rooms in the office
- [x] Check if the meeting room is available or not (true or false)
- [ ] Enter the meeting room & it becomes unavailable
- [ ] Leave the meeting room & it becomes available again
- [ ] See a list of available meeting rooms in the office
- [ ] Raise an error if try to use unavailable room

### Stretch

Office Manager can:

- [ ] receive a text message whenever a meeting room becomes available again
- [ ] see the name of the meeting and the name of the team that is using the room
