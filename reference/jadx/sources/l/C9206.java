package l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: l.ۡ᩻ۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: T4ZG */
/* JADX INFO: loaded from: classes3.dex */
public final class C9206 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final List f31291;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String f31292;

    public C9206(C17367 c17367) {
        this.f31292 = c17367.m40442();
        int i = c17367.readInt();
        this.f31291 = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            List list = this.f31291;
            C8500 c8500 = new C8500();
            c8500.f29474 = true;
            c8500.f29469 = c17367.readInt();
            c8500.f29468 = c17367.readInt();
            c8500.f29471 = c17367.readInt();
            c8500.f29470 = c17367.readInt();
            c8500.f29473 = c17367.readInt();
            c8500.f29472 = c17367.m40442();
            c8500.f29466 = c17367.m40442();
            c8500.f29467 = c17367.m40442();
            c8500.f29465 = c17367.m40442();
            list.add(c8500);
        }
    }

    public C9206(String str, List list) {
        this.f31292 = str;
        this.f31291 = list;
    }
}
