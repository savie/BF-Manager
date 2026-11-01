package l;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: renamed from: l.ܽۗ, reason: contains not printable characters */
/* JADX INFO: compiled from: 33S4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C16362 extends InputConnectionWrapper {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ C4895 f52669;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16362(InputConnection inputConnection, C4895 c4895) {
        super(inputConnection, false);
        this.f52669 = c4895;
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        if (this.f52669.m13622(C14246.m34379(inputContentInfo), i, bundle)) {
            return true;
        }
        return super.commitContent(inputContentInfo, i, bundle);
    }
}
