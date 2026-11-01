package l;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: renamed from: l.ۜܿۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: KBGJ */
/* JADX INFO: loaded from: classes3.dex */
public final class C6905 extends AbstractC18194 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public final ArrayList f23235 = new ArrayList();

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ByteArrayOutputStream f23236;

    @Override // l.InterfaceC10434
    public final void flush() {
    }

    @Override // l.AbstractC18194
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final String mo18528() {
        return "byte stream";
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final ArrayList m18526() {
        return this.f23235;
    }

    public final String toString() {
        return (String) C9030.stream(this.f23235).map(new C13256(0)).collect(C1890.joining(System.lineSeparator()));
    }

    @Override // l.InterfaceC10434
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final DataOutputStream mo18523() {
        return new DataOutputStream(this.f23236);
    }

    @Override // l.AbstractC18194, l.InterfaceC10434
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void mo18529(String str) {
        String str2 = this.f58140;
        if (str2 != null && !str2.equals(str)) {
            throw new RuntimeException(C7997.m21055("Ended different class: ", str, " then was started ", str2));
        }
        ByteArrayOutputStream byteArrayOutputStream = this.f23236;
        if (byteArrayOutputStream != null) {
            this.f23235.add(new C4082(str, byteArrayOutputStream.toByteArray()));
        }
        super.mo18529(str);
        this.f23236 = null;
    }

    @Override // l.AbstractC18194, l.InterfaceC10434
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18525(String str, C11521 c11521, AbstractC0410 abstractC0410) {
        this.f58140 = str;
        this.f23236 = new ByteArrayOutputStream(1024);
    }

    @Override // l.InterfaceC10434
    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public final void mo18527(String str) {
        try {
            this.f23236.write((str + System.lineSeparator()).getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // l.InterfaceC10434
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void mo18524(String str) {
        try {
            this.f23236.write(str.getBytes(StandardCharsets.UTF_8));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
