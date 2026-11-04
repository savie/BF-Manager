package l;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;
import java.net.URI;

/* JADX INFO: renamed from: l.ۗۡۘ, reason: contains not printable characters */
/* JADX INFO: compiled from: W2ZW */
/* JADX INFO: loaded from: classes3.dex */
public class C3298 implements InterfaceC15976 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC17468 f10780;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final URI f10781;

    @Override // l.InterfaceC11501
    public final boolean delete() {
        return false;
    }

    @Override // l.InterfaceC11501
    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public final long mo10890() {
        return 0L;
    }

    public C3298(URI uri, EnumC17468 enumC17468) {
        C17359.requireNonNull(uri);
        C17359.requireNonNull(enumC17468);
        if (uri.getPath() == null) {
            throw new IllegalArgumentException("URI must have a path: " + uri);
        }
        this.f10781 = uri;
        this.f10780 = enumC17468;
    }

    @Override // l.InterfaceC11501
    public final String getName() {
        return this.f10781.getPath();
    }

    @Override // l.InterfaceC11501
    public final URI toUri() {
        return this.f10781;
    }

    @Override // l.InterfaceC11501
    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public final InputStream mo10889() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC11501
    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public final OutputStream mo10888() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC11501
    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public final Writer mo10887() {
        throw new UnsupportedOperationException();
    }

    @Override // l.InterfaceC15976
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final EnumC17468 mo10885() {
        return this.f10780;
    }

    @Override // l.InterfaceC15976
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final boolean mo10886(String str, EnumC17468 enumC17468) {
        StringBuilder sbM27333 = C10732.m27333(str);
        sbM27333.append(enumC17468.f56797);
        String string = sbM27333.toString();
        if (!enumC17468.equals(this.f10780)) {
            return false;
        }
        URI uri = this.f10781;
        return string.equals(uri.getPath()) || uri.getPath().endsWith("/".concat(string));
    }

    public final String toString() {
        return getClass().getName() + "[" + this.f10781 + "]";
    }
}
