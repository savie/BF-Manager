package l;

/* JADX INFO: renamed from: l.ۙۘ۟, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4393 {
    /* JADX INFO: renamed from: ۙ */
    public abstract int mo5986();

    /* JADX INFO: renamed from: ۙ */
    public void mo5987(C11450 c11450) {
        int iMo5986 = mo5986();
        c11450.f38541.m46793(iMo5986);
        if (c11450.f38532) {
            System.out.print(" frame_type=" + iMo5986);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m12253(AbstractC16579[] abstractC16579Arr, AbstractC16579[] abstractC16579Arr2, C23800 c23800) {
        int length = abstractC16579Arr.length - abstractC16579Arr2.length;
        if (length > 4 || length < -4) {
            return Integer.MAX_VALUE;
        }
        int length2 = length > 0 ? abstractC16579Arr2.length : abstractC16579Arr.length;
        for (int i = 0; i < length2; i++) {
            AbstractC16579 abstractC16579 = abstractC16579Arr[i];
            AbstractC16579 abstractC165710 = abstractC16579Arr2[i];
            boolean zM52399 = true;
            if (abstractC16579 == null) {
                if (abstractC165710 != null) {
                    zM52399 = false;
                }
            } else if (abstractC165710 == null) {
                zM52399 = false;
            } else {
                EnumC6617 enumC6617Mo1933 = abstractC16579.mo1933();
                EnumC6617 enumC6617 = EnumC6617.INT;
                if ((!enumC6617Mo1933.m17951(enumC6617) && !abstractC16579.m39001(EnumC6617.BOOLEAN)) || (!abstractC165710.mo1933().m17951(enumC6617) && !abstractC165710.m39001(EnumC6617.BOOLEAN))) {
                    EnumC6617 enumC6618 = EnumC6617.UNINITIALIZED_THIS;
                    if (abstractC16579.m39001(enumC6618)) {
                        zM52399 = abstractC165710.m39001(enumC6618);
                    } else {
                        EnumC6617 enumC6619 = EnumC6617.UNINITIALIZED_OBJECT;
                        if (abstractC16579.m39001(enumC6619)) {
                            if (!abstractC165710.m39001(enumC6619) || ((C12011) abstractC16579).f40246 != ((C12011) abstractC165710).f40246) {
                                zM52399 = false;
                            }
                        } else if (abstractC165710.m39001(enumC6618) || abstractC165710.m39001(enumC6619)) {
                            zM52399 = false;
                        } else {
                            zM52399 = c23800.m52399(abstractC16579, abstractC165710);
                        }
                    }
                }
            }
            if (!zM52399) {
                return Integer.MAX_VALUE;
            }
        }
        return length;
    }
}
