document.addEventListener("DOMContentLoaded", function () {
    const container = document.createElement("div");
    container.style.maxWidth = "900px";
    container.style.margin = "40px auto";
    container.style.lineHeight = "1.6";
    container.style.fontFamily = "Arial, sans-serif";

    container.innerHTML = `
        <h1>About ECORoute</h1>
        <h2>Making Every Journey Smarter</h2>

        <p>
            We are a group of passionate developers based in Malaysia who recognized
            a critical flaw in everyday navigation. For too long, commuters have been
            forced to choose routes only based on speed, leading to hidden fuel costs
            and invisible environmental damage. ECORoute was born to change that.
        </p>

        <h2>Our Mission: Transparent Travel</h2>
        <p>
            Our mission is to bridge the gap between user priorities—saving money,
            saving time—and environmental responsibility. We provide the most
            transparent routing decisions so users can make the best choice for their
            wallet and the planet.
        </p>

        <h2>The ECORoute Difference</h2>
        <ul>
            <li>Time</li>
            <li>Distance</li>
            <li>Estimated Fuel Consumption</li>
            <li>Estimated CO₂ Emission</li>
        </ul>

        <p>
            By factoring in your specific car model and real-time traffic patterns,
            ECORoute enables you to choose the most efficient travel path.
        </p>

        <h2>Driving Sustainable Change</h2>
        <p>
            Using ECORoute helps reduce fuel waste, lower emissions, and minimize
            air pollution. We believe small changes in daily travel behavior can
            create a huge impact on our environment.
        </p>

        <h2>Meet the Team</h2>
        <p>
            We are <strong>Team KMPH</strong> — dedicated to building smart,
            sustainable and impactful solutions for commuters in Southeast Asia.
            Thank you for driving with us!
        </p>
    `;

    document.body.appendChild(container);
});