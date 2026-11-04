package l;

import android.graphics.Point;

/* JADX INFO: renamed from: l.᩷ۜᩴ, reason: contains not printable characters */
/* JADX INFO: compiled from: PAKQ */
/* JADX INFO: loaded from: classes.dex */
public final class C21891 implements InterfaceC17003 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ ServiceC10702 f70728;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Point f70729;

    public C21891(ServiceC10702 serviceC10702, Point point) {
        this.f70728 = serviceC10702;
        this.f70729 = point;
    }

    @Override // l.InterfaceC17003
    /* JADX INFO: renamed from: ۙ */
    public final void mo14636() {
        ServiceC10702 serviceC10702 = this.f70728;
        int i = serviceC10702.f33978;
        Point point = this.f70729;
        point.x = i;
        point.y = serviceC10702.f33982;
    }
}
