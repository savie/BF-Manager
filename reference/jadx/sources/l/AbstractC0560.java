package l;

import java.util.Map;

/* JADX INFO: renamed from: l.֡ܿᩳ, reason: contains not printable characters */
/* JADX INFO: compiled from: A8XS */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0560 implements InterfaceC21022 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final int f2339;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map f2340;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final String f2341;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public int f2342 = -1;

    public AbstractC0560(Map map, int i, String str) {
        this.f2341 = str;
        this.f2339 = i;
        this.f2340 = map;
    }

    @Override // l.InterfaceC21022
    public final String name() {
        return this.f2341;
    }

    @Override // l.InterfaceC21022
    public final int start() {
        return this.f2339;
    }

    @Override // l.InterfaceC21022
    public final int end() {
        return this.f2342;
    }

    @Override // l.InterfaceC21022
    public Map attributes() {
        return this.f2340;
    }

    @Override // l.InterfaceC21022
    public final boolean isClosed() {
        return this.f2342 > -1;
    }
}
