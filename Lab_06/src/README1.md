# EN

1. You're developing a Sound Manager for an Operating System. The software manages sound effects for system notifications, app notifications, browsers, games, music etc.

- The audio system must manage all sound-related tasks and must not allow duplicate managers.
- The class must allow developers to share the same sound manager for the sound settings.
- The manager takes a hefty amount of time to load, so it would be wise to create it at start up.
- The sound manager must implement the provided `ISoundManager` interface.

2. Later on you discover that you have created a bottleneck and would need to introduce ASAP multiple sound managers: for music, browsers and notifications.

3. It seems like the OS needs a class for the sound effects that are played. Currently, building one sound effect instance takes quite a while, but we need multiple instances to send across the OS. Is there something we can do about it?
 