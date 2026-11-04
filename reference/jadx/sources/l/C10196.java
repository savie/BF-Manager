package l;

import java.util.List;

/* JADX INFO: renamed from: l.ۢܳᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: 4AWI */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C10196 implements InterfaceC0818 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ List f32619;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C8640 f32620;

    public /* synthetic */ C10196(List list, C8640 c8640) {
        this.f32619 = list;
        this.f32620 = c8640;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002d  */
    @Override // l.InterfaceC0818
    public final void accept(Object obj) {
        int size;
        C19147 c19147;
        C16626 c16626 = (C16626) obj;
        int i = ActivityC5440.f18993;
        List list = this.f32619;
        if (list.isEmpty()) {
            size = list.size();
        } else {
            C16626 c16627 = (C16626) C7750.m21093(1, list);
            if (c16627.f53761.m44387() == 22 || ((c19147 = c16627.f53759) != null && c19147.m44387() == 22)) {
                size = list.size() - 1;
            } else {
                size = list.size();
            }
        }
        list.add(size, c16626);
        C8640 c8640 = this.f32620;
        c8640.f28227.notifyItemInserted(size);
        c8640.f28226.smoothScrollToPosition(size);
        C24832.m55356();
    }
}
