# Museum of Candy

A responsive front-end landing page built with HTML, CSS, Bootstrap, and JavaScript.

## Project Overview

Museum of Candy is a responsive single-page website designed to practice modern front-end layout techniques and responsive web design.

The project combines Bootstrap's grid and responsive utility classes with custom CSS to create a colorful landing page that adapts its layout and typography based on screen size.

The site includes a responsive navigation bar, alternating image and content sections, custom typography and styling, and a navigation background effect triggered as the user scrolls.

## Features

- Responsive page layout
- Collapsible mobile navigation
- Fixed navigation bar
- Responsive Bootstrap grid
- Alternating image and text sections
- Responsive images
- Custom typography
- Custom CSS styling
- CSS media queries
- Scroll-based navigation styling
- Responsive content ordering
- Google Fonts integration

## Technologies Used

- HTML5
- CSS3
- Bootstrap 4
- JavaScript
- jQuery
- Google Fonts
- Responsive Web Design

## Responsive Design

The website uses Bootstrap's responsive grid system to adapt the page to different viewport sizes.

Content is divided into rows and columns using Bootstrap classes such as:

```html id="tx3xzb"
<div class="row align-items-center">
    <div class="col-md-6">
        ...
    </div>
    <div class="col-md-6">
        ...
    </div>
</div>
```

On larger screens, content is displayed side-by-side. On smaller screens, the Bootstrap grid allows those sections to stack vertically.

Responsive ordering utilities are also used to change the order in which text and images appear depending on the viewport size.

For example:

```html id="mpcc9y"
<div class="col-md-6 order-2 order-md-1">
```

This allows the visual layout to change without requiring separate HTML structures for desktop and mobile users.

## Navigation

The site includes a fixed Bootstrap navigation bar with links for:

- Home
- About
- Tickets

On smaller displays, the navigation collapses into a mobile-friendly menu using Bootstrap's navbar functionality.

The navigation bar also changes appearance when the user scrolls down the page.

A small jQuery script checks the page's scroll position and applies a custom `scrolled` CSS class:

```javascript id="fn48cc"
$(document).scroll(function () {
    var $nav = $("#mainNavbar");
    $nav.toggleClass("scrolled", $(this).scrollTop() > $nav.height());
});
```

The custom CSS then applies a different background and transition effect.

This creates visual feedback as the user moves through the page.

## Page Layout

The landing page uses multiple full-width sections containing responsive images and text.

The content alternates between:

```text id="k5fbpf"
Image | Text
Text  | Image
Image | Text
```

This creates visual variety while maintaining a consistent layout throughout the page.

Bootstrap's alignment, spacing, ordering, and sizing utilities are combined with custom CSS to control how these sections behave across different viewport sizes.

## Custom Styling

While Bootstrap provides the underlying responsive structure, custom CSS establishes the site's visual identity.

Custom styling controls:

- Background colors
- Heading colors
- Paragraph colors
- Typography
- Navigation colors
- Hover states
- Content spacing
- Heading sizes
- Scroll-state navigation appearance

The project uses Google's Nunito font with multiple font weights to create the site's lightweight typography.

## Media Queries

The stylesheet includes a custom media query for screens below 1200 pixels.

At this breakpoint, large heading sizes are reduced to better fit the available screen space.

This supplements Bootstrap's responsive behavior with project-specific styling.
