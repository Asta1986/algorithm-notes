from utils.utils import printNumTable


def grid_paths_topdown(auxtable, endrowidx, endcolidx):
    if endrowidx == 0 or endcolidx == 0:
      return 1

    if auxtable[endrowidx][endcolidx] is not None:
      return auxtable[endrowidx][endcolidx]

    auxtable[endrowidx][endcolidx] = grid_paths_topdown(auxtable, endrowidx-1, endcolidx) +\
        grid_paths_topdown(auxtable, endrowidx, endcolidx-1)

    return auxtable[endrowidx][endcolidx]

def grid_paths(rows, columns):
    auxtable = [[None for _ in range(columns)] for _ in range(rows)]
    auxtable[0][0] = 1

    res = grid_paths_topdown(auxtable, rows-1, columns-1)
    printNumTable(auxtable)

    return res

def grid_paths_recursive(rows, columns):
    """Returns the number of distinct paths from the starting point of a grid
    [0, 0] to the end point [m, n].
    Valid moves from any cell [i, j] are [i + 1, j] (go down) or [i, j + 1] (go right).
    Preconditions: rows > 0 and columns > 0.
    """
    if rows == 1 or columns == 1:
        return 1
    else:
        return grid_paths_recursive(rows-1, columns) + grid_paths_recursive(rows, columns-1)
