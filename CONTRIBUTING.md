# Contributing to Codio

Thank you for your interest in contributing to this Java programming projects repository! This guide will help you get started.

## Getting Started

1. **Fork the repository** to your GitHub account
2. **Clone your fork** locally:
   ```bash
   git clone https://github.com/YOUR-USERNAME/Codio.git
   cd Codio
   ```
3. **Create a branch** for your contribution:
   ```bash
   git checkout -b feature/your-feature-name
   ```

## Types of Contributions

### Bug Fixes
- Found a bug in one of the projects? Submit a fix!
- Include a clear description of the bug and how your fix resolves it

### Improvements
- Code optimization
- Better documentation
- Additional test cases
- Enhanced comments

### New Projects
- Add new Java projects that fit the repository theme
- Follow the existing project structure
- Include clear comments and documentation

## Code Standards

### Java Style Guidelines
- Use meaningful variable and method names
- Follow standard Java naming conventions:
  - Classes: `PascalCase`
  - Methods/variables: `camelCase`
  - Constants: `UPPER_SNAKE_CASE`
- Include comments for complex logic
- Keep methods focused and concise

### Project Structure
Each project should be in its own directory with:
- Clear, descriptive directory name
- All `.java` source files
- Comments explaining the purpose and approach

### Documentation
- Update the main README.md if adding a new project
- Include usage instructions if applicable
- Document any prerequisites or dependencies

## Building and Testing

Before submitting a pull request:

1. **Compile your code**:
   ```bash
   javac YourProject.java
   ```

2. **Test your code**:
   ```bash
   java YourProject
   ```

3. **Verify no compilation warnings or errors**

4. **Check that existing projects still work**

## Submitting Changes

1. **Commit your changes** with a descriptive message:
   ```bash
   git add .
   git commit -m "Add: Brief description of your changes"
   ```

   Use conventional commit prefixes:
   - `Add:` - New feature or project
   - `Fix:` - Bug fix
   - `Improve:` - Code improvement or optimization
   - `Docs:` - Documentation changes

2. **Push to your fork**:
   ```bash
   git push origin feature/your-feature-name
   ```

3. **Open a Pull Request** on GitHub:
   - Provide a clear title and description
   - Reference any related issues
   - Explain what changes you made and why

## Code Review Process

- Maintainers will review your PR within a few days
- You may be asked to make changes or improvements
- Once approved, your PR will be merged

## Questions?

Feel free to open an issue if you have questions about contributing!

## License

By contributing, you agree that your contributions will be licensed under the same MIT License that covers this project.

---

Thank you for making Codio better!
