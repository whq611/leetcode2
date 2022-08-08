class Solution:
    def reachingPoints(self, sx: int, sy: int, tx: int, ty: int) -> bool:
        while sx<=tx and sy<=ty:
            if sx==tx and sy==ty:
                return True
            if tx>ty:
                tx -= max((tx - sx) // ty, 1) * ty
            else:
                ty -= max((ty - sy) // tx, 1) * tx
        return False
