def hamiltonian_cycle(graph, start, current, path=[]):
	path = path + [current]

	if len(path) == len(graph) and start in graph[current]:
		return [path]

	cycles = []

	for node in graph[current]:
		if node not in path:
			new_cycles = hamiltonian_cycle(graph, start, node, path)
			cycles.extend(new_cycles)

	return cycles


def all_hamiltonian_cycles(graph, start_node):
    all_cycles = []
    cycles_from_node = hamiltonian_cycle(graph, start_node, start_node)
    all_cycles.extend(cycles_from_node)

    return all_cycles


graph = {
	"Afg": ["Eng", "Pak", "SL", "Ned"],
	"Aus": ["Afg", "Ind", "NZ", "SA", "SL", "Pak", "Ban", "Eng", "Ned"],
	"Ban": ["SL", "Afg"],
	"Ind": ["Afg", "Aus", "NZ", "SA", "SL", "Pak", "Ban", "Eng", "Ned"],
	"Eng": ["Pak", "Ned", "Ban"],
	"NZ": ["Afg", "Ban", "Eng", "Ned", "SL"],
	"Ned": ["Ban", "SA"],
	"SA": ["Eng", "Pak", "NZ", "Aus", "Afg", "Ban", "SL"],
	"SL": ["Eng", "Ned"],
	"Pak": ["SL", "Ban", "NZ", "Ned"]
}
cycles = all_hamiltonian_cycles(graph, "Ban")

print("Number of Hamiltonian cycles:", len(cycles))
print("Hamiltonian cycles:")
for cycle in cycles:
    print(cycle)
