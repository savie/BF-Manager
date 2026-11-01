package l;

/* JADX INFO: renamed from: l.ۡ۫ۨ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y5MV */
/* JADX INFO: loaded from: classes3.dex */
public final class C8880 implements InterfaceC5614 {

    /* JADX INFO: renamed from: ܽᩳ᩸, reason: not valid java name and contains not printable characters */
    private static final short[] f30440 = {9058, 1959, 14851, -10155, 16052, -12593, -12393};

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C10291 f30441;

    /* JADX WARN: Code duplicated, block: B:60:0x022a A[PHI: r8 r10 r11 r12 r19
      0x022a: PHI (r8v4 short[]) = (r8v2 short[]), (r8v3 short[]), (r8v2 short[]), (r8v2 short[]), (r8v2 short[]) binds: [B:59:0x0228, B:26:0x00e1, B:16:0x00a1, B:13:0x0087, B:10:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x022a: PHI (r10v4 int) = (r10v2 int), (r10v3 int), (r10v2 int), (r10v2 int), (r10v2 int) binds: [B:59:0x0228, B:26:0x00e1, B:16:0x00a1, B:13:0x0087, B:10:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x022a: PHI (r11v4 int) = (r11v2 int), (r11v3 int), (r11v2 int), (r11v2 int), (r11v2 int) binds: [B:59:0x0228, B:26:0x00e1, B:16:0x00a1, B:13:0x0087, B:10:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x022a: PHI (r12v4 short) = (r12v3 short), (r12v2 short), (r12v2 short), (r12v2 short), (r12v2 short) binds: [B:59:0x0228, B:26:0x00e1, B:16:0x00a1, B:13:0x0087, B:10:0x0081] A[DONT_GENERATE, DONT_INLINE]
      0x022a: PHI (r19v4 int) = (r19v3 int), (r19v2 int), (r19v2 int), (r19v2 int), (r19v2 int) binds: [B:59:0x0228, B:26:0x00e1, B:16:0x00a1, B:13:0x0087, B:10:0x0081] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:68:0x027e A[PHI: r2 r3 r4 r5 r6 r7 r14 r15 r17 r18 r24
      0x027e: PHI (r2v4 java.lang.Object[]) = 
      (r2v2 java.lang.Object[])
      (r2v2 java.lang.Object[])
      (r2v3 java.lang.Object[])
      (r2v2 java.lang.Object[])
      (r2v2 java.lang.Object[])
      (r2v2 java.lang.Object[])
     binds: [B:67:0x027c, B:63:0x025e, B:44:0x0178, B:36:0x0136, B:32:0x0114, B:22:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r3v4 char) = (r3v2 char), (r3v2 char), (r3v3 char), (r3v2 char), (r3v2 char), (r3v2 char) binds: [B:67:0x027c, B:63:0x025e, B:44:0x0178, B:36:0x0136, B:32:0x0114, B:22:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r4v4 int) = (r4v2 int), (r4v2 int), (r4v2 int), (r4v2 int), (r4v3 int), (r4v2 int) binds: [B:67:0x027c, B:63:0x025e, B:44:0x0178, B:36:0x0136, B:32:0x0114, B:22:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r5v4 int) = (r5v2 int), (r5v2 int), (r5v2 int), (r5v2 int), (r5v3 int), (r5v2 int) binds: [B:67:0x027c, B:63:0x025e, B:44:0x0178, B:36:0x0136, B:32:0x0114, B:22:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r6v3 java.lang.String) = 
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v2 java.lang.String)
      (r6v4 java.lang.String)
     binds: [B:67:0x027c, B:63:0x025e, B:44:0x0178, B:36:0x0136, B:32:0x0114, B:22:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r7v4 int) = (r7v2 int), (r7v2 int), (r7v2 int), (r7v3 int), (r7v2 int), (r7v2 int) binds: [B:67:0x027c, B:63:0x025e, B:44:0x0178, B:36:0x0136, B:32:0x0114, B:22:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r14v4 short[]) = (r14v2 short[]), (r14v2 short[]), (r14v2 short[]), (r14v3 short[]), (r14v2 short[]), (r14v2 short[]) binds: [B:67:0x027c, B:63:0x025e, B:44:0x0178, B:36:0x0136, B:32:0x0114, B:22:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r15v4 int) = (r15v2 int), (r15v2 int), (r15v2 int), (r15v3 int), (r15v2 int), (r15v2 int) binds: [B:67:0x027c, B:63:0x025e, B:44:0x0178, B:36:0x0136, B:32:0x0114, B:22:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r17v4 char) = (r17v3 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char), (r17v2 char) binds: [B:67:0x027c, B:63:0x025e, B:44:0x0178, B:36:0x0136, B:32:0x0114, B:22:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r18v4 int) = (r18v2 int), (r18v3 int), (r18v2 int), (r18v2 int), (r18v2 int), (r18v2 int) binds: [B:67:0x027c, B:63:0x025e, B:44:0x0178, B:36:0x0136, B:32:0x0114, B:22:0x00bf] A[DONT_GENERATE, DONT_INLINE]
      0x027e: PHI (r24v5 short) = (r24v3 short), (r24v4 short), (r24v3 short), (r24v3 short), (r24v3 short), (r24v3 short) binds: [B:67:0x027c, B:63:0x025e, B:44:0x0178, B:36:0x0136, B:32:0x0114, B:22:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x02b0 A[PHI: r16
      0x02b0: PHI (r16v4 short[]) = (r16v3 short[]), (r16v2 short[]), (r16v2 short[]), (r16v2 short[]) binds: [B:71:0x02ae, B:40:0x0156, B:10:0x0081, B:6:0x0061] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void m23031(String str) {
        int iM45029;
        int i;
        int i2;
        int i3 = C0629.f2722;
        int i4 = C3535.f13026;
        int iM11306 = ThreadFactoryC3888.m11306("ۖۙ") ^ i3;
        int i5 = ((iM11306 ^ i4) * 20353) ^ (-779868580);
        Object[] objArr = null;
        short[] sArr = null;
        short[] sArr2 = null;
        int i6 = iM11306 ^ 1310696044;
        C10291 c10291 = null;
        char c = 0;
        int iM450210 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        int i11 = 0;
        char c2 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 2091952951;
        short s2 = 0;
        short[] sArr3 = null;
        String strM10901 = null;
        int i15 = 0;
        while (true) {
            i14 = i6 ^ (i5 & (((i14 ^ i4) * 6419) >> 31));
            switch (i14) {
                case -2135505270:
                case 1596620941:
                    c2 = 0;
                    if (C2788.f10625 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۡ") ^ i3;
                        i = ((iM45029 ^ i4) * 787) ^ 386625294;
                        i2 = 1565723211;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۙ") ^ i4;
                        i = ((iM45029 ^ i3) * (-8391)) ^ 1550948403;
                        i2 = -1216886535;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1959867969:
                case -629509620:
                    strM10901 = C3722.m10901(sArr2, i8, i9, i10);
                    if (C1025.f4800 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۡ") ^ i3;
                        i = ((iM45029 ^ i4) * 787) ^ 386625294;
                        i2 = 1565723211;
                    } else {
                        iM45029 = (C19806.m45029("֨ۡ") + i4) * 27;
                        i = ((iM45029 ^ i3) * 5499) ^ (-693604297);
                        i2 = 993565733;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1680976880:
                case -928073484:
                    objArr = new Object[1];
                    c = 0;
                    if (C0962.f3784) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۡ") ^ i3;
                        i = ((iM45029 ^ i4) * 787) ^ 386625294;
                        i2 = 1565723211;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۛۤ") + i3) * 29;
                        i = ((iM45029 ^ i4) * (-14457)) ^ (-756379558);
                        i2 = -1969932012;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1659357268:
                case 1943772068:
                    C0278.m1784(c10291, C0216.m1574(iM450210 ^ i15, objArr));
                    break;
                case -1638405526:
                case -415064602:
                    AbstractC0464.m2313();
                    C1377.m4833();
                    break;
                case -1420930145:
                case -103886965:
                    if (C10634.m26820()) {
                        iM45029 = (C19806.m45029("֨ܽ") ^ i3) * 17;
                        i = ((iM45029 ^ i4) * (-8747)) ^ (-290077094);
                        i2 = -1389930873;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ֨") ^ i3;
                        i = ((iM45029 ^ i4) * (-22123)) ^ (-153619674);
                        i2 = -899738836;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1394067302:
                case -443808249:
                    if ((s2 * s) - i13 <= 0) {
                        iM45029 = (ThreadFactoryC3888.m11306("ۧۧ") + i4) * 29;
                        i = ((iM45029 ^ i3) * 6881) ^ 889960735;
                        i2 = 732306963;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ܰۨ") ^ i3;
                        i = ((iM45029 ^ i4) * (-4093)) ^ (-1524504834);
                        i2 = -75039266;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1193360779:
                case -387331934:
                    i10 = 19225;
                    iM45029 = (ThreadFactoryC3888.m11306("᩷ܰ") ^ i4) * 101;
                    i = ((iM45029 ^ i3) * (-27243)) ^ (-1749203454);
                    i2 = 154381195;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1185499123:
                case 2055106685:
                    objArr[c] = str;
                    if (C10634.f36300 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ֨") ^ i3;
                        i = ((iM45029 ^ i4) * (-22123)) ^ (-153619674);
                        i2 = -899738836;
                    } else {
                        iM45029 = (C19806.m45029("ܰ᩷") ^ i4) * (-53);
                        i = ((iM45029 ^ i3) * (-30285)) ^ (-2015911392);
                        i2 = -747765808;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -1057028322:
                case 662770541:
                    c10291.m41562(ThreadFactoryC3888.m11306(strM10901) ^ 2123101389);
                    break;
                case -973072110:
                case 77303935:
                    iM450210 = C19806.m45029(C1398.m4892(sArr, i11, i7, i10));
                    i15 = 2116844055;
                    if (C2704.f10408) {
                        iM45029 = (ThreadFactoryC3888.m11306("᩷ۗ") ^ i4) * (-89);
                        i = ((iM45029 ^ i3) * (-11913)) ^ (-845930925);
                        i2 = -641076131;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۡ") ^ i3;
                        i = ((iM45029 ^ i4) * 787) ^ 386625294;
                        i2 = 1565723211;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -869622175:
                case -651159132:
                    if (C19806.f63586) {
                        iM45029 = (C19806.m45029("֨ܽ") ^ i3) * 17;
                        i = ((iM45029 ^ i4) * (-8747)) ^ (-290077094);
                        i2 = -1389930873;
                    } else {
                        iM45029 = C19806.m45029("ۧ۟") ^ i4;
                        i = ((iM45029 ^ i3) * 19221) ^ 1547286607;
                        i2 = 413673106;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -576562091:
                case 1720450677:
                    c10291 = this.f30441;
                    if (str == null) {
                        int iM11307 = (i3 - ThreadFactoryC3888.m11306("ܿۙ")) * (-83);
                        i5 = ((iM11307 ^ i4) * 5351) ^ 1331510312;
                        i6 = iM11307 ^ (-1605594893);
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩹ܳ") ^ i3;
                        i = ((iM45029 ^ i4) * 16057) ^ 1052340573;
                        i2 = -2002600178;
                        i6 = iM45029 ^ i2;
                        i5 = i;
                    }
                    break;
                case -392746799:
                case 578144366:
                    s2 = sArr3[c2];
                    i12 = s2 * s2;
                    if (C1025.f4800 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۡ") ^ i3;
                        i = ((iM45029 ^ i4) * 787) ^ 386625294;
                        i2 = 1565723211;
                    } else {
                        iM45029 = (i3 - C19806.m45029("֫ۛ")) * 33;
                        i = ((iM45029 ^ i4) * 10713) ^ 1606813267;
                        i2 = -690489794;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -182789352:
                case -171153060:
                    sArr = f30440;
                    i11 = 1;
                    i7 = 3;
                    if (RunnableC0195.f1321 >= 0) {
                        iM45029 = ThreadFactoryC3888.m11306("ۢۡ") ^ i3;
                        i = ((iM45029 ^ i4) * 787) ^ 386625294;
                        i2 = 1565723211;
                    } else {
                        iM45029 = (i3 - C19806.m45029("֨ۗ")) * (-69);
                        i = ((iM45029 ^ i4) * 32291) ^ 1326247733;
                        i2 = -946453080;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case -136721680:
                case 1605234600:
                    i10 = 22166;
                    iM45029 = (ThreadFactoryC3888.m11306("᩷ܰ") ^ i4) * 101;
                    i = ((iM45029 ^ i3) * (-27243)) ^ (-1749203454);
                    i2 = 154381195;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 323407345:
                case 1258820850:
                    sArr2 = f30440;
                    i8 = 4;
                    i9 = 3;
                    if (C2477.f9839 <= 0) {
                        iM45029 = (C19806.m45029("֨ܽ") ^ i3) * 17;
                        i = ((iM45029 ^ i4) * (-8747)) ^ (-290077094);
                        i2 = -1389930873;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("ۨ᩸") ^ i4) * (-45);
                        i = ((iM45029 ^ i3) * (-17403)) ^ (-1725946418);
                        i2 = -16353071;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 566144805:
                case 1195951701:
                    C1066.m4023();
                    iM45029 = (C19806.m45029("֨ܽ") ^ i3) * 17;
                    i = ((iM45029 ^ i4) * (-8747)) ^ (-290077094);
                    i2 = -1389930873;
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1227826223:
                case 1567664235:
                    sArr3 = f30440;
                    if (C7105.m18985()) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ֨") ^ i3;
                        i = ((iM45029 ^ i4) * (-22123)) ^ (-153619674);
                        i2 = -899738836;
                    } else {
                        iM45029 = (C19806.m45029("᩻᩶") + i3) * (-37);
                        i = ((iM45029 ^ i4) * 17693) ^ (-1344767883);
                        i2 = 1870060296;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                case 1468372618:
                case 1581547306:
                    i13 = i12 + 175695025;
                    s = 26510;
                    if (MenuItemOnMenuItemClickListenerC3244.f12064 >= 0) {
                        iM45029 = (C19806.m45029("֨ܽ") ^ i3) * 17;
                        i = ((iM45029 ^ i4) * (-8747)) ^ (-290077094);
                        i2 = -1389930873;
                    } else {
                        iM45029 = ThreadFactoryC3888.m11306("᩸ܺ") ^ i4;
                        i = ((iM45029 ^ i3) * 15983) ^ 72183626;
                        i2 = -1167130150;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
                default:
                    C2642.m8171();
                    if (ViewGroupOnHierarchyChangeListenerC1916.f7262) {
                        iM45029 = ThreadFactoryC3888.m11306("ۜ֨") ^ i3;
                        i = ((iM45029 ^ i4) * (-22123)) ^ (-153619674);
                        i2 = -899738836;
                    } else {
                        iM45029 = (ThreadFactoryC3888.m11306("۬᩹") ^ i4) * 127;
                        i = ((iM45029 ^ i3) * 5863) ^ 2134692594;
                        i2 = 1003219057;
                    }
                    i6 = iM45029 ^ i2;
                    i5 = i;
                    break;
            }
            return;
        }
    }

    public C8880(C10291 c10291) {
        this.f30441 = c10291;
    }

    @Override // l.InterfaceC5614
    /* JADX INFO: renamed from: ֨ */
    public final boolean mo2357() {
        return C3577.m10564(this.f30441);
    }
}
