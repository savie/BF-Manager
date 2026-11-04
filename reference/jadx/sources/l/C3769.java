package l;

import android.widget.TextView;
import java.io.InputStream;
import java.util.Hashtable;

/* JADX INFO: renamed from: l.ۗ᩻ܺ, reason: contains not printable characters */
/* JADX INFO: compiled from: D73Y */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C3769 implements InterfaceC5417, InterfaceC10523, InterfaceC4787, InterfaceC12718 {
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static StringBuilder m12235(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m12236(Class cls, Hashtable hashtable, String str, Class cls2, String str2) {
        hashtable.put(str, cls.getName());
        hashtable.put(str2, cls2.getName());
    }

    @Override // l.InterfaceC4787
    public boolean test(Object obj) {
        return true;
    }

    @Override // l.InterfaceC12718
    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public InputStream mo12237(InputStream inputStream) {
        return new C0529(inputStream);
    }

    @Override // l.InterfaceC5417
    public Object apply(Object obj) {
        return ((InterfaceC22486) obj).mo2296().getClass().getSimpleName();
    }

    @Override // l.InterfaceC10523
    public void accept(TextView textView) {
        textView.setText("0");
    }
}
