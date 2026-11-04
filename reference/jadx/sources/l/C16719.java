package l;

import android.content.ClipData;
import android.view.ContentInfo;
import com.alipay.sdk.m.y.l;

/* JADX INFO: renamed from: l.ܺۡ, reason: contains not printable characters */
/* JADX INFO: compiled from: JB1Y */
/* JADX INFO: loaded from: classes5.dex */
public final class C16719 implements InterfaceC17465 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final ContentInfo f54009;

    public C16719(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.f54009 = contentInfo;
    }

    @Override // l.InterfaceC17465
    /* JADX INFO: renamed from: ۙ */
    public final ContentInfo mo38085() {
        return this.f54009;
    }

    @Override // l.InterfaceC17465
    /* JADX INFO: renamed from: ᩷ */
    public final ClipData mo38087() {
        return this.f54009.getClip();
    }

    @Override // l.InterfaceC17465
    public final int getSource() {
        return this.f54009.getSource();
    }

    @Override // l.InterfaceC17465
    /* JADX INFO: renamed from: ۫ */
    public final int mo38086() {
        return this.f54009.getFlags();
    }

    public final String toString() {
        return "ContentInfoCompat{" + this.f54009 + l.d;
    }
}
