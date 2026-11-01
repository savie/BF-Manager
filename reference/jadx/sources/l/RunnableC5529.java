package l;

import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: l.ۚᩴۖ, reason: contains not printable characters */
/* JADX INFO: compiled from: Y6SG */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class RunnableC5529 implements Runnable {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ int f18951;

    /* JADX INFO: renamed from: ᩶, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f18952;

    public /* synthetic */ RunnableC5529(int i, Object obj) {
        this.f18951 = i;
        this.f18952 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f18951) {
            case 0:
                ((C22463) this.f18952).f73334.m30021((Throwable) new CancellationException("Checkpoint was superseded or discarded"));
                return;
            default:
                C18292 c18292 = (C18292) this.f18952;
                C6919 c6919 = c18292.f58361;
                C6111 c6111 = c18292.f58359;
                C20409 c20409 = c18292.f58360;
                c18292.f58362 = false;
                FutureC12075 futureC12075 = c18292.f58355;
                if (futureC12075.isDone()) {
                    return;
                }
                try {
                    if (!c20409.f66146 || c6111 == null || c20409.f66125 != c6111 || c20409.f16887 != c6919 || !c18292.f58354.equals(c20409.m13346().f53983.mo33986()) || (c18292.f58351 != null && c6111.m17000() != c18292.f58351)) {
                        throw new CancellationException("Saving owner changed before capture");
                    }
                    FutureC12075 futureC12076 = c18292.f58357;
                    if (futureC12076 != null) {
                        if (!futureC12076.isDone()) {
                            return;
                        } else {
                            c18292.f58357.m30027();
                        }
                    }
                    FutureC12075 futureC12077 = c18292.f58350;
                    if (futureC12077 != null) {
                        if (!futureC12077.isDone()) {
                            return;
                        }
                        if (((C14393) c18292.f58350.m30027()).f47162 != c6111.m17000()) {
                            throw new CancellationException("Saving loaded content was replaced");
                        }
                    }
                    if (c20409.f66148 == null && c20409.f66124 == null) {
                        if (c20409.f66132 != null) {
                            C8042 c8042 = c20409.f66132;
                            C8042 c8043 = c18292.f58349;
                            if (c8042 != c8043) {
                                if (c8043 != null || c18292.f58351 != null) {
                                    throw new CancellationException("Saving preparation was superseded");
                                }
                                C8042 c8044 = c20409.f66132;
                                c18292.f58349 = c8044;
                                FutureC12075 futureC12075M21170 = c8044.m21170();
                                c18292.f58350 = futureC12075M21170;
                                futureC12075M21170.m30016((InterfaceC7486) new C13291(1, c18292));
                            }
                        }
                        if (c6919.m18540()) {
                            return;
                        }
                        if (c20409.f66149 == null || c20409.f66149.isDone()) {
                            if (c20409.m13344()) {
                                throw new IllegalStateException("Cannot save failed editor content");
                            }
                            if (c18292.f58351 == null) {
                                c18292.f58351 = c6111.m17000();
                            }
                            C23232 c23232M46101 = C20409.m46101(c20409, c18292.f58356);
                            c18292.f58352 = c23232M46101;
                            if (c23232M46101 != null) {
                                c18292.m42499();
                                futureC12075.m30019(c18292.f58352);
                                return;
                            } else {
                                if (c6111.m16820()) {
                                    throw new IllegalStateException("Editor content is not available for saving");
                                }
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    c18292.m42500(th);
                    return;
                }
        }
    }
}
