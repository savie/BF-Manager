package l;

import java.util.Map;

/* JADX INFO: renamed from: l.ۤۚ᩹, reason: contains not printable characters */
/* JADX INFO: compiled from: A8XS */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC10663 implements InterfaceC13864 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final Map f33822;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final String f33823;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public int f33824 = -1;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final int f33825;

    public AbstractC10663(Map map, int i, String str) {
        this.f33823 = str;
        this.f33825 = i;
        this.f33822 = map;
    }

    @Override // l.InterfaceC13864
    public final String name() {
        return this.f33823;
    }

    @Override // l.InterfaceC13864
    public final int start() {
        return this.f33825;
    }

    @Override // l.InterfaceC13864
    public final int end() {
        return this.f33824;
    }

    @Override // l.InterfaceC13864
    public Map attributes() {
        return this.f33822;
    }

    @Override // l.InterfaceC13864
    public final boolean isClosed() {
        return this.f33824 > -1;
    }
}
