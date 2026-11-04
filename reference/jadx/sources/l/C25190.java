package l;

import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: renamed from: l.᩻ܿۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: H6H3 */
/* JADX INFO: loaded from: classes.dex */
public final class C25190 implements InterfaceC5798 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public Boolean f81417;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public C0415 f81418;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public List f81419 = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public C10711 f81420;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C7873 f81421;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public String f81422;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final String f81423;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final C25190 m56165() {
        this.f81417 = Boolean.TRUE;
        return this;
    }

    public C25190() {
        EnumC11763 enumC11763 = EnumC11763.STRING;
        EnumSet.noneOf(EnumC2069.class);
        this.f81423 = "dex-input.verify-checksum";
    }

    @Override // l.InterfaceC5798
    public final String name() {
        return this.f81423;
    }

    @Override // l.InterfaceC5798
    /* JADX INFO: renamed from: ۙ */
    public final String mo16915() {
        return this.f81422;
    }

    @Override // l.InterfaceC5798
    public final List values() {
        return (List) C1170.stream(this.f81419).map(this.f81418).collect(C2025.toList());
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C25190 m56158() {
        this.f81422 = "verify dex file checksum before load";
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C25190 m56161(C7873 c7873) {
        this.f81421 = c7873;
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C25190 m56160(C0415 c0415) {
        this.f81418 = c0415;
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C25190 m56162(C10711 c10711) {
        this.f81420 = c10711;
        return this;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C25190 m56159(List list) {
        this.f81419 = list;
        return this;
    }

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Function m56163() {
        return this.f81421;
    }

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final Consumer m56166() {
        return this.f81420;
    }

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final void m56164() {
        String str = this.f81422;
        String str2 = this.f81423;
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException(C25272.m56409("Description should be set for option: ", str2));
        }
        if (this.f81421 == null) {
            throw new IllegalArgumentException(C25272.m56409("Parser should be set for option: ", str2));
        }
        if (this.f81418 == null) {
            throw new IllegalArgumentException(C25272.m56409("Formatter should be set for option: ", str2));
        }
        if (this.f81420 == null) {
            throw new IllegalArgumentException(C25272.m56409("Setter should be set for option: ", str2));
        }
    }
}
