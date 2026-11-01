package l;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import bin.mt.plus.R;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.ܰܺ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: V8F2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C13913 {

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C11545 f45827;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final C22149 f45828;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public C14764 f45829;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final List f45830;

    public C13913(C11545 c11545, List list) {
        this.f45827 = c11545;
        this.f45830 = list;
        C22149 c22149 = new C22149(c11545.m28824());
        c22149.m49138();
        this.f45828 = c22149;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33754(InterfaceC2557 interfaceC2557) {
        if (interfaceC2557.isDirectory() || !(interfaceC2557 instanceof C14764)) {
            throw new IllegalArgumentException();
        }
        C14764 c14764 = (C14764) interfaceC2557;
        this.f45829 = c14764;
        C22149 c22149 = this.f45828;
        c22149.m49153(c14764);
        c22149.m49148(c14764.mo7986() ? R.string.MT_Protector : R.string.MT_Protector);
        c22149.m49157(c14764.getSize());
        c22149.m49162(c14764.getTime());
        C11731 c11731Mo7971 = c14764.mo7971();
        if (c11731Mo7971 != null) {
            c22149.m49141(new C4328(c11731Mo7971)).m7266(6);
            String strM29326 = c11731Mo7971.m29326();
            String strM29320 = c11731Mo7971.m29320();
            if (!TextUtils.isEmpty(strM29326) || !TextUtils.isEmpty(strM29320)) {
                c22149.m49146(new C8811(strM29326, strM29320)).m33386();
            }
        }
        if (c14764.mo7986()) {
            c22149.m49145(c14764.mo7978(), (View.OnClickListener) null).m9599(6);
        }
        c22149.m49155();
        c22149.m49159();
        C23519.m51792(c22149.m49160(), this.f45827, c14764);
    }

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public final void m33755(InterfaceC2557 interfaceC2557) {
        if (interfaceC2557.mo7985() || !(interfaceC2557 instanceof C14764)) {
            throw new IllegalArgumentException();
        }
        C14764 c14764 = (C14764) interfaceC2557;
        this.f45829 = c14764;
        C22149 c22149 = this.f45828;
        c22149.m49153(c14764);
        c22149.m49148(c14764.mo7986() ? R.string.MT_Protector : R.string.MT_Protector);
        c22149.m49157(c14764.getSize());
        c22149.m49162(c14764.getTime());
        C11731 c11731Mo7971 = c14764.mo7971();
        if (c11731Mo7971 != null) {
            c22149.m49141(new C1438(c11731Mo7971)).m7266(6);
            String strM29326 = c11731Mo7971.m29326();
            String strM29320 = c11731Mo7971.m29320();
            if (!TextUtils.isEmpty(strM29326) || !TextUtils.isEmpty(strM29320)) {
                c22149.m49146(new C14472(strM29326, strM29320)).m33386();
            }
        }
        if (c14764.mo7986()) {
            c22149.m49145(c14764.mo7978(), (View.OnClickListener) null).m9599(6);
        }
        c22149.m49143(R.string.MT_Protector, new C7275(this)).m9599(8);
        c22149.m49159();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m33753(String str) {
        C22149 c22149 = this.f45828;
        List list = this.f45830;
        c22149.m49152(list);
        c22149.m49150(str, new View.OnLongClickListener() { // from class: l.֫᩷֨
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                C13913.m33748(this.f7647);
                return true;
            }
        });
        Iterator it = list.iterator();
        long size = 0;
        while (it.hasNext()) {
            size += ((InterfaceC2557) it.next()).getSize();
        }
        c22149.m49157(size);
        c22149.m49143(R.string.MT_Protector, new C21778(5, this)).m9599(8);
        c22149.m49159();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33747(final TextView textView, final TextView textView2, final AbstractC9677 abstractC9677, final List list) {
        textView.setText("...");
        textView2.setText("...");
        C4716.f16636.submit(new Runnable() { // from class: l.ۙܺ֨
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC9677 abstractC9678 = abstractC9677;
                C22959 c22959M50799 = C22959.m50799(300);
                LinkedList linkedList = new LinkedList(list);
                final int i = 0;
                final int i2 = 0;
                int i3 = 0;
                while (true) {
                    boolean zIsEmpty = linkedList.isEmpty();
                    final TextView textView3 = textView;
                    final TextView textView4 = textView2;
                    if (zIsEmpty) {
                        C16737.m39273(new Runnable() { // from class: l.ۗ᩷֨
                            @Override // java.lang.Runnable
                            public final void run() {
                                textView3.setText(String.valueOf(i));
                                textView4.setText(String.valueOf(i2));
                            }
                        });
                        return;
                    }
                    i3++;
                    if ((i3 & 255) == 0 && c22959M50799.m50802()) {
                        C16737.m39273(new Runnable() { // from class: l.ۢ᩷֨
                            @Override // java.lang.Runnable
                            public final void run() {
                                textView3.setText(String.valueOf(i));
                                textView4.setText(String.valueOf(i2));
                            }
                        });
                    }
                    InterfaceC2557 interfaceC2557 = (InterfaceC2557) linkedList.removeFirst();
                    if (interfaceC2557.mo7985()) {
                        i++;
                    } else {
                        i2++;
                        try {
                            linkedList.addAll(abstractC9678.mo10263(interfaceC2557.getPath(), true));
                        } catch (IOException unused) {
                        }
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m33748(C13913 c13913) {
        C14764 c14764 = c13913.f45829;
        if (c14764 != null) {
            C16737.m39266(R.string.MT_Protector, c14764.getPath());
        }
    }
}
