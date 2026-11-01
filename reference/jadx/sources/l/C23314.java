package l;

import android.content.ClipData;
import android.view.ContentInfo;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.᩺᩻, reason: contains not printable characters */
/* JADX INFO: compiled from: JB1Y */
/* JADX INFO: loaded from: classes.dex */
public final class C23314 implements InterfaceC15553 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ContentInfo f75586;

    public C23314(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.f75586 = contentInfo;
    }

    @Override // l.InterfaceC15553
    /* JADX INFO: renamed from: ۙ */
    public final ContentInfo mo37192() {
        return this.f75586;
    }

    @Override // l.InterfaceC15553
    /* JADX INFO: renamed from: ܰ */
    public final ClipData mo37193() {
        return this.f75586.getClip();
    }

    @Override // l.InterfaceC15553
    public final int getSource() {
        return this.f75586.getSource();
    }

    @Override // l.InterfaceC15553
    /* JADX INFO: renamed from: ֨ */
    public final int mo37191() {
        return this.f75586.getFlags();
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.f75586 + l.d;
    }
}
