
class ProjectVersion {
	Integer major
	Integer minor

	ProjectVersion(Integer major, Integer minor) {
		this.major = major
		this.minor = minor
	}

	@Override
	String toString() {
		"$major.$minor"
	}
}
