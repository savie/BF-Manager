package l;

/* JADX INFO: renamed from: l.ܳۧۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: X68P */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class RunnableC14476 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C18105 f47455;

    public /* synthetic */ RunnableC14476(C18105 c18105) {
        this.f47455 = c18105;
    }

    /* JADX WARN: Code duplicated, block: B:68:0x0129 A[Catch: RuntimeException -> 0x01ab, TryCatch #0 {RuntimeException -> 0x01ab, blocks: (B:33:0x0080, B:35:0x00ac, B:38:0x00b8, B:40:0x00c1, B:42:0x00c7, B:44:0x00cd, B:46:0x00d5, B:48:0x00db, B:50:0x00e1, B:52:0x00e9, B:54:0x00f3, B:56:0x0105, B:58:0x010b, B:60:0x0113, B:68:0x0129, B:62:0x0117, B:64:0x011d, B:66:0x0125, B:69:0x015e, B:71:0x017c, B:73:0x0189, B:74:0x0193, B:75:0x01a0, B:37:0x00b6), top: B:81:0x0080 }] */
    @Override // java.lang.Runnable
    public final void run() {
        final C18105 c18105 = this.f47455;
        if (c18105.f57907 || c18105.f57909.f20728 != c18105) {
            return;
        }
        if (!c18105.m42168()) {
            c18105.m42167((AbstractC12359) null, (Throwable) null);
            return;
        }
        C6111 c6111 = c18105.f57909;
        if (c6111.f20787) {
            return;
        }
        if (c6111.f20764.mo14804() || c18105.f57909.f20774 || c18105.f57909.f20715 || c18105.f57909.f20779 || c18105.f57909.f20725 || c18105.f57909.f20802 != null || (c18105.f57909.f20808 != 0 && c18105.f57909.m16978() <= 0)) {
            C16737.m39274(new RunnableC14476(c18105), 10L);
            return;
        }
        C6111 c6112 = c18105.f57909;
        c18105.f57903 = c6112.f20764;
        if (!c18105.f57899) {
            c6112.m16905();
            c18105.f57897.setReadOnly(true);
            c18105.f57899 = true;
            c18105.f57909.m16764();
        }
        try {
            C3329 c3329Mo2399 = c18105.f57897.mo2399();
            c18105.f57894 = c3329Mo2399;
            c18105.f57910 = c3329Mo2399.m9896();
            c18105.f57908 = c18105.f57909.m17020();
            c18105.f57906 = c18105.f57909.f20808;
            C18811 c18811M16815 = c18105.f57909.m16815();
            if (!c18105.f57912.equals(c18811M16815) || !c18105.f57895.f41324.equals(c18811M16815)) {
                c18105.f57893 = null;
            }
            c18105.f57912 = c18811M16815;
            c18105.f57892 = null;
            C21033 c21033 = c18105.f57893;
            if (c21033 != null && !c21033.m47425() && c18105.f57896 == c18105.f57910) {
                AbstractC12359 abstractC12359 = c18105.f57895;
                if (abstractC12359.f41297 == c18105.f57897 && !abstractC12359.mo14804() && !c18105.f57895.f41325 && c18105.f57895.mo14778() == null && !c18105.f57895.f41308.isEmpty() && c18105.f57895.f41308.m10803().f47317 == c18105.f57893.m47422()) {
                    AbstractC12359 abstractC123510 = c18105.f57895;
                    if ((abstractC123510 instanceof C21489) && ((C21489) abstractC123510).m48130() && c18105.f57906 == 0) {
                        int iM47423 = c18105.f57893.m47423(0);
                        int iM47429 = c18105.f57893.m47429() - 1;
                        c18105.f57892 = new C12131(c18105.f57895, iM47423, c18105.f57893.m47417(iM47429) - iM47423, c18105.f57893.m47427(iM47429) - c18105.f57893.m47424(0), c18105.f57910, c18105.f57909.m16978());
                    } else {
                        AbstractC12359 abstractC123511 = c18105.f57895;
                        if ((abstractC123511 instanceof C5325) && ((C5325) abstractC123511).m14806() && c18105.f57906 != 0) {
                            int iM47424 = c18105.f57893.m47423(0);
                            int iM474210 = c18105.f57893.m47429() - 1;
                            c18105.f57892 = new C12131(c18105.f57895, iM47424, c18105.f57893.m47417(iM474210) - iM47424, c18105.f57893.m47427(iM474210) - c18105.f57893.m47424(0), c18105.f57910, c18105.f57909.m16978());
                        }
                    }
                }
            }
            c18105.f57893 = C21033.m47414(c18105.f57894.length(), new C7628[0]);
            c18105.f57896 = c18105.f57910;
            c18105.f57907 = true;
            if (c18105.f57909.f20770.m32663()) {
                c18105.f57909.f20770.m32617(c18105.f57897);
                C12131 c12131 = c18105.f57892;
                if (c12131 == null) {
                    c18105.f57909.f20770.m32661(c18105.f57897);
                } else {
                    c18105.f57909.f20770.m32653(c18105.f57897, c12131.f40617, c12131.f40619);
                }
            }
            C4716.f16636.execute(new Runnable() { // from class: l.ۘܳۖ
                @Override // java.lang.Runnable
                public final void run() {
                    c18105.m42170();
                }
            });
        } catch (RuntimeException e) {
            c18105.m42167((AbstractC12359) null, e);
        }
    }
}
