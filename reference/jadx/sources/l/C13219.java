package l;

import android.content.DialogInterface;
import android.content.pm.PackageInfo;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.TextView;
import bin.mt.plus.Main;
import bin.mt.plus.R;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: l.۫ܺ۫, reason: contains not printable characters */
/* JADX INFO: compiled from: X992 */
/* JADX INFO: loaded from: classes4.dex */
public final class C13219 {

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C10981 f42197;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public TextView f42198;

    /* JADX INFO: renamed from: ۤ, reason: not valid java name and contains not printable characters */
    public ArrayList f42199;

    /* JADX INFO: renamed from: ۫, reason: not valid java name and contains not printable characters */
    public final LinkedList f42200 = new LinkedList();

    /* JADX INFO: renamed from: ܳ, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC23960 f42201;

    /* JADX INFO: renamed from: ᩴ, reason: not valid java name and contains not printable characters */
    public C22391 f42202;

    /* JADX INFO: renamed from: ᩷, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC8327 f42203;

    /* JADX INFO: renamed from: ᩸, reason: not valid java name and contains not printable characters */
    public C19987 f42204;

    public C13219(Main main, ArrayList arrayList) {
        this.f42199 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f42199.add(new C15456(this, (PackageInfo) arrayList.get(i)));
        }
        View viewM40395 = main.m40395(R.layout.MT_Protector);
        C7308 c7308 = (C7308) viewM40395.findViewById(R.id.searchView);
        this.f42198 = (TextView) viewM40395.findViewById(R.id.title);
        C19987 c19987 = (C19987) viewM40395.findViewById(R.id.MT_Protector);
        this.f42204 = c19987;
        C10981 c10981 = new C10981(this);
        this.f42197 = c10981;
        c19987.setAdapter((ListAdapter) c10981);
        c19987.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.۬᩻۫
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                C13219.m32755(this.f44889, i2);
            }
        });
        c19987.setFastScrollEnabled(true);
        C18597.m43179(c19987);
        c7308.m20007(new C22170(this));
        C2361 c2361BuildDialog = main.buildDialog();
        c2361BuildDialog.m8005(viewM40395);
        c2361BuildDialog.m8026(R.string.MT_Protector, new DialogInterface.OnClickListener() { // from class: l.ۙܺ۫
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                C13219.m32754(this.f17405);
            }
        });
        c2361BuildDialog.m8022(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f42203 = c2361BuildDialog.m7999();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m32755(C13219 c13219, int i) {
        C10981 c10981 = c13219.f42197;
        C15456 c15456 = (C15456) c10981.f34688.get(i);
        c15456.f50315 = !c15456.f50315;
        c10981.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32754(C13219 c13219) {
        if (c13219.f42202 != null) {
            ArrayList arrayList = new ArrayList();
            for (C15456 c15456 : c13219.f42199) {
                if (c15456.f50315) {
                    arrayList.add(c15456.f50317);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            C22391 c22391 = c13219.f42202;
            C7495.m20536((List) c22391.f72491, (C8614) c22391.f72492, arrayList);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32765(ViewOnClickListenerC23960 viewOnClickListenerC23960) {
        this.f42203.m22424(-3, C21576.m49088(R.string.MT_Protector), null);
        this.f42201 = viewOnClickListenerC23960;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32763(int i) {
        this.f42198.setText(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32764(C22391 c22391) {
        this.f42202 = c22391;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m32762() {
        Button buttonM22440;
        DialogInterfaceC8327 dialogInterfaceC8327 = this.f42203;
        dialogInterfaceC8327.m22432();
        if (this.f42201 != null && (buttonM22440 = dialogInterfaceC8327.m22440()) != null) {
            buttonM22440.setOnClickListener(this.f42201);
        }
        LinkedList linkedList = new LinkedList();
        for (C15456 c15456 : this.f42199) {
            if (c15456.f50318) {
                linkedList.add(c15456);
            }
        }
        C5261.f18540.execute(new RunnableC11226(2, this, linkedList));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m32756(C13219 c13219, LinkedList linkedList) {
        final C15456 c15456;
        while (c13219.f42203.m22434()) {
            while (!c13219.f42200.isEmpty()) {
                int iMax = Math.max(1, (c13219.f42204.getLastVisiblePosition() - c13219.f42204.getFirstVisiblePosition()) + 1);
                synchronized (c13219.f42200) {
                    while (c13219.f42200.size() > iMax) {
                        c13219.f42200.removeFirst();
                    }
                    c15456 = (C15456) c13219.f42200.removeLast();
                }
                if (c15456.f50318) {
                    c15456.f50318 = false;
                    final BitmapDrawable bitmapDrawableM48870 = RunnableC21479.m48870(c15456.f50317);
                    C21576.m49068(new Runnable() { // from class: l.ᩴܺ۫
                        @Override // java.lang.Runnable
                        public final void run() {
                            C15456 c15457 = c15456;
                            C6389 c6389 = c15457.f50320;
                            boolean z = c15457.f50319;
                            BitmapDrawable bitmapDrawable = bitmapDrawableM48870;
                            if (!z) {
                                c6389.setDrawable(bitmapDrawable);
                                return;
                            }
                            Drawable drawable = c6389.getDrawable();
                            bitmapDrawable.setBounds(drawable.getBounds());
                            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
                            c6389.setDrawable(transitionDrawable);
                            transitionDrawable.setCrossFadeEnabled(true);
                            transitionDrawable.startTransition(300);
                        }
                    });
                }
                while (c13219.f42203.m22434() && c13219.f42204.m45949()) {
                    SystemClock.sleep(100L);
                }
                if (!c13219.f42203.m22434()) {
                    return;
                }
            }
            while (!linkedList.isEmpty()) {
                if (c13219.f42200.isEmpty()) {
                    final C15456 c15457 = (C15456) linkedList.removeFirst();
                    if (c15457.f50318) {
                        c15457.f50318 = false;
                        final BitmapDrawable bitmapDrawableM48871 = RunnableC21479.m48870(c15457.f50317);
                        C21576.m49068(new Runnable() { // from class: l.ᩴܺ۫
                            @Override // java.lang.Runnable
                            public final void run() {
                                C15456 c15458 = c15457;
                                C6389 c6389 = c15458.f50320;
                                boolean z = c15458.f50319;
                                BitmapDrawable bitmapDrawable = bitmapDrawableM48871;
                                if (!z) {
                                    c6389.setDrawable(bitmapDrawable);
                                    return;
                                }
                                Drawable drawable = c6389.getDrawable();
                                bitmapDrawable.setBounds(drawable.getBounds());
                                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
                                c6389.setDrawable(transitionDrawable);
                                transitionDrawable.setCrossFadeEnabled(true);
                                transitionDrawable.startTransition(300);
                            }
                        });
                    }
                    while (c13219.f42203.m22434() && c13219.f42204.m45949()) {
                        SystemClock.sleep(100L);
                    }
                    if (!c13219.f42203.m22434()) {
                        return;
                    }
                }
            }
            return;
        }
    }
}
