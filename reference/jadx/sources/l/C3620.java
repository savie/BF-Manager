package l;

import bin.mt.plus.R;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: l.ۗᩴ᩸, reason: contains not printable characters */
/* JADX INFO: compiled from: 45AX */
/* JADX INFO: loaded from: classes3.dex */
public final class C3620 extends AbstractC14806 {
    public /* synthetic */ C3620(int i) {
        this();
    }

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public static C3620 m11750() {
        return C23758.f76988;
    }

    public C3620() {
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ܶ, reason: not valid java name and contains not printable characters */
    public final String mo11753() {
        return C21576.m49088(R.string.MT_Protector);
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ֫, reason: not valid java name and contains not printable characters */
    public final byte[] mo11751() throws IOException {
        InputStream resourceAsStream = C3620.class.getResourceAsStream("/assets/".concat("testkey.pk8"));
        if (resourceAsStream == null) {
            resourceAsStream = C21576.m49086().open("testkey.pk8");
        }
        return C20244.m46522(resourceAsStream, 0);
    }

    @Override // l.AbstractC14806
    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public final byte[] mo11752() throws IOException {
        InputStream resourceAsStream = C3620.class.getResourceAsStream("/assets/".concat("testkey.x509.pem"));
        if (resourceAsStream == null) {
            resourceAsStream = C21576.m49086().open("testkey.x509.pem");
        }
        return C20244.m46522(resourceAsStream, 0);
    }
}
