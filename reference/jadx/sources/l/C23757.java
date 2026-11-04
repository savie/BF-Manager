package l;

import android.content.Context;
import android.content.ContextWrapper;
import java.util.HashMap;

/* JADX INFO: renamed from: l.᩹ᩴ᩷, reason: contains not printable characters */
/* JADX INFO: compiled from: N8QX */
/* JADX INFO: loaded from: classes.dex */
public final class C23757 {

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final HashMap f76984;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final Context f76986;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public int f76985 = 2000;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C0404 f76983 = InterfaceC14814.f48448;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public boolean f76987 = true;

    public C23757(ContextWrapper contextWrapper) {
        this.f76986 = contextWrapper.getApplicationContext();
        HashMap map = new HashMap(8);
        this.f76984 = map;
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
    public final C3619 m53041() {
        return new C3619(this.f76986, this.f76984, this.f76985, this.f76983, this.f76987);
    }
}
