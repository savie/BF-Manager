package l;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import bin.mt.plugin.api.ui.dialog.DualProgressDialog;
import bin.mt.plugin.api.util.Consumer;
import com.umeng.commonsdk.listener.OnGetOaidListener;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;
import net.sf.sevenzipjbinding.ISequentialOutStream;
import net.sf.sevenzipjbinding.SevenZipException;

/* JADX INFO: renamed from: l.֨ܳ᩺, reason: contains not printable characters */
/* JADX INFO: compiled from: 4BMC */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C1188 implements InterfaceC7359, InterfaceC18848, InterfaceC4509, ISequentialOutStream, Consumer, OnGetOaidListener, InterfaceC13320, InterfaceC17591 {

    /* JADX INFO: renamed from: ܺ, reason: not valid java name and contains not printable characters */
    public final /* synthetic */ Object f5283;

    public /* synthetic */ C1188(Object obj) {
        this.f5283 = obj;
    }

    public /* synthetic */ C1188(C19602 c19602, C13314 c13314) {
        this.f5283 = c13314;
    }

    @Override // bin.mt.plugin.api.util.Consumer
    /* JADX INFO: renamed from: accept */
    public void mo42471accept(Object obj) {
        ((DualProgressDialog) this.f5283).lambda$new$0((CharSequence) obj);
    }

    @Override // com.umeng.commonsdk.listener.OnGetOaidListener
    public void onGetOaid(String str) {
        ((java.util.function.Consumer) this.f5283).n(str);
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۙ */
    public void mo1179(AbstractC23903 abstractC23903) {
        ((C12325) this.f5283).m30618((C19670) abstractC23903);
    }

    @Override // l.InterfaceC13320
    /* JADX INFO: renamed from: ۨ */
    public /* synthetic */ boolean mo1180() {
        return false;
    }

    @Override // l.InterfaceC7359
    public void invoke(Object obj) {
        C13314 c13314 = (C13314) this.f5283;
        ((InterfaceC10430) obj).mo26347(c13314);
        int i = c13314.f44194;
    }

    @Override // net.sf.sevenzipjbinding.ISequentialOutStream
    public int write(ByteBuffer byteBuffer) throws SevenZipException {
        try {
            return ((InterfaceC10983) this.f5283).write(byteBuffer);
        } catch (IOException e) {
            throw new SevenZipException(e);
        }
    }

    @Override // l.InterfaceC17591
    /* JADX INFO: renamed from: ۙ */
    public Object mo1012(int i, int i2, byte[] bArr) {
        return ((C23942) this.f5283).f77631.mo17388(i, i2, bArr);
    }

    @Override // l.InterfaceC18848
    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public void mo4355(AbstractC20745 abstractC20745) {
        C3872.m11211(((C11545) this.f5283).m28824(), abstractC20745, (List) null);
    }

    @Override // l.InterfaceC4509
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public void mo4354(TextView textView) {
        List<InterfaceC2557> list = (List) this.f5283;
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(5);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder sb = new StringBuilder();
        for (InterfaceC2557 interfaceC2557 : list) {
            if (spannableStringBuilder.length() < 1000) {
                if (spannableStringBuilder.length() > 0) {
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) ", ");
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(C20368.f65970), length, length + 2, 17);
                }
                spannableStringBuilder.append((CharSequence) interfaceC2557.getName());
            }
            if (sb.length() > 0) {
                sb.append(", ");
            }
            sb.append(interfaceC2557.getName());
        }
        String string = sb.toString();
        textView.setText(spannableStringBuilder);
        textView.setOnClickListener(new ViewOnClickListenerC18579(1, string));
        C0674.m3027(textView);
    }
}
