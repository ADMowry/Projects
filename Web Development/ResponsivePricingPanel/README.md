# Responsive Pricing Panel

A responsive pricing component built with HTML and CSS, featuring a mobile-first layout and CSS Flexbox.

## Project Overview

The Responsive Pricing Panel is a front-end web development project designed to practice building responsive user-interface components using HTML and CSS.

The page presents three pricing tiers—Personal, Small Team, and Enterprise—in a clean pricing-card interface.

Rather than relying on a CSS framework for its layout, the project uses CSS Flexbox and a custom media query to transform the interface from a vertically stacked mobile layout into a horizontal desktop pricing panel.

This project demonstrates responsive design, Flexbox, CSS selectors, pseudo-classes, transitions, typography, and reusable CSS classes.

## Features

- Three-tier pricing interface
- Responsive mobile-first layout
- CSS Flexbox positioning
- Custom breakpoint for desktop layouts
- Responsive images
- Featured pricing option
- Interactive button hover and focus states
- CSS transitions
- Google Fonts integration
- CSS reset for consistent browser styling
- Reusable pricing-card classes

## Technologies Used

- HTML5
- CSS3
- CSS Flexbox
- CSS Media Queries
- Google Fonts
- Responsive Web Design

## Pricing Tiers

The interface displays three pricing options.

### Personal

Includes:

- Custom domains
- Inactivity-based sleep
- Free pricing tier

### Small Team

Includes:

- Continuous availability
- Multiple workers
- $150 pricing tier
- Featured free-trial button

### Enterprise

Includes:

- Dedicated resources
- Horizontal scalability
- $400 pricing tier
- Free-trial option

Each tier follows the same HTML structure, allowing shared CSS classes to provide consistent styling across the component.

## Responsive Design

The project follows a mobile-first approach.

The pricing panel initially uses:

```css id="9wncn8"
display: flex;
flex-direction: column;
```

This causes the pricing plans to stack vertically on smaller screens.

When the viewport reaches 900 pixels, a media query changes the layout:

```css id="y5dqlk"
@media (min-width: 900px) {
    .panel {
        flex-direction: row;
    }
}
```

The pricing tiers then appear side-by-side.

This approach allows the same HTML structure to support both mobile and desktop layouts without requiring separate markup.

## Flexbox Layout

Flexbox is used in multiple parts of the design.

The page body uses Flexbox to center the pricing panel horizontally and vertically within the viewport.

The pricing panel itself is also a flex container.

On smaller screens, its children are arranged vertically:

```text id="tycpgx"
Personal
   ↓
Small Team
   ↓
Enterprise
```

On larger screens, the flex direction changes:

```text id="zpppxz"
Personal | Small Team | Enterprise
```

This demonstrates how Flexbox can be combined with media queries to create responsive components with relatively little CSS.

## Reusable CSS

The three pricing options share common CSS classes rather than defining separate styles for every plan.

Examples include:

```css id="eufgj4"
.pricing-plan
.pricing-img
.pricing-header
.pricing-features
.pricing-features-item
.pricing-price
.pricing-button
```

Using shared classes keeps the visual design consistent and reduces unnecessary duplication.

## Featured Plan Styling

The Small Team plan uses an additional modifier class:

```html id="a1ugfv"
class="pricing-button is-featured"
```

The `is-featured` class changes the appearance of the call-to-action button while preserving the shared styling provided by `pricing-button`.

This demonstrates how CSS classes can be combined to create variations of reusable UI components.

## Interactive States

The pricing buttons include both hover and focus states.

When users interact with a standard pricing button, its background changes using a short CSS transition.

The featured button receives its own hover and focus styling.

Including focus states also provides visual feedback for users navigating through interactive elements using a keyboard.

## CSS Reset

The stylesheet incorporates the Meyer CSS Reset before the custom project styling.

The reset removes many browser-default margins, padding values, list styles, and other presentation differences.

Custom styles can then be applied from a more consistent starting point across browsers.

## Typography

The page uses Open Sans through Google Fonts with multiple font weights.

Typography is customized through:

- Font weights
- Font sizes
- Letter spacing
- Line height
- Uppercase text transformation
- Custom colors

These properties help establish a consistent visual hierarchy between plan names, features, prices, and buttons.
