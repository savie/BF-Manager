package l;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩻ۚܰ, reason: contains not printable characters */
/* JADX INFO: compiled from: N8QX */
/* JADX INFO: loaded from: classes.dex */
public final class C23493 {

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final HashMap f76073;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final Context f76074;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public int f76072 = 2000;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22217 f76071 = InterfaceC11593.f38960;

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public boolean f76070 = true;

    public C23493(ContextWrapper contextWrapper) {
        this.f76074 = contextWrapper.getApplicationContext();
        HashMap map = new HashMap(8);
        this.f76073 = map;
        map.put(0, 1000000L);
        map.put(2, -9223372036854775807L);
        map.put(3, -9223372036854775807L);
        map.put(4, -9223372036854775807L);
        map.put(5, -9223372036854775807L);
        map.put(10, -9223372036854775807L);
        map.put(9, -9223372036854775807L);
        map.put(7, -9223372036854775807L);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C14321 m51753() {
        return new C14321(this.f76074, this.f76073, this.f76072, this.f76071, this.f76070);
    }
}
