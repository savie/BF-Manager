package l;

/* JADX INFO: renamed from: l.ܶ᩹ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: M664 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC16393 {
    /* JADX INFO: renamed from: ۙ */
    public abstract int mo7568();

    /* JADX INFO: renamed from: ۙ */
    public void mo7569(C3715 c3715) {
        int iMo7568 = mo7568();
        c3715.f12754.m24017(iMo7568);
        if (c3715.f12766) {
            System.out.print(" frame_type=" + iMo7568);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static int m38918(AbstractC22664[] abstractC22664Arr, AbstractC22664[] abstractC22664Arr2, C24705 c24705) {
        int length = abstractC22664Arr.length - abstractC22664Arr2.length;
        if (length > 4 || length < -4) {
            return Integer.MAX_VALUE;
        }
        int length2 = length > 0 ? abstractC22664Arr2.length : abstractC22664Arr.length;
        for (int i = 0; i < length2; i++) {
            AbstractC22664 abstractC22664 = abstractC22664Arr[i];
            AbstractC22664 abstractC22665 = abstractC22664Arr2[i];
            boolean zM55149 = true;
            if (abstractC22664 == null) {
                if (abstractC22665 != null) {
                    zM55149 = false;
                }
            } else if (abstractC22665 == null) {
                zM55149 = false;
            } else {
                EnumC21172 enumC21172Mo9097 = abstractC22664.mo9097();
                EnumC21172 enumC21172 = EnumC21172.INT;
                if ((!enumC21172Mo9097.m48308(enumC21172) && !abstractC22664.m51067(EnumC21172.BOOLEAN)) || (!abstractC22665.mo9097().m48308(enumC21172) && !abstractC22665.m51067(EnumC21172.BOOLEAN))) {
                    EnumC21172 enumC21173 = EnumC21172.UNINITIALIZED_THIS;
                    if (abstractC22664.m51067(enumC21173)) {
                        zM55149 = abstractC22665.m51067(enumC21173);
                    } else {
                        EnumC21172 enumC21174 = EnumC21172.UNINITIALIZED_OBJECT;
                        if (abstractC22664.m51067(enumC21174)) {
                            if (!abstractC22665.m51067(enumC21174) || ((C23765) abstractC22664).f77001 != ((C23765) abstractC22665).f77001) {
                                zM55149 = false;
                            }
                        } else if (abstractC22665.m51067(enumC21173) || abstractC22665.m51067(enumC21174)) {
                            zM55149 = false;
                        } else {
                            zM55149 = c24705.m55149(abstractC22664, abstractC22665);
                        }
                    }
                }
            }
            if (!zM55149) {
                return Integer.MAX_VALUE;
            }
        }
        return length;
    }
}
