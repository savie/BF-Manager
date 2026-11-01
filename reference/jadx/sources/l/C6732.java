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

/* JADX INFO: renamed from: l.ۜۨ֨, reason: contains not printable characters */
/* JADX INFO: compiled from: X992 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6732 {

    /* JADX INFO: renamed from: ֨, reason: not valid java name and contains not printable characters */
    public final LinkedList f22658 = new LinkedList();

    /* JADX INFO: renamed from: ۖ, reason: not valid java name and contains not printable characters */
    public C6606 f22659;

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public C22255 f22660;

    /* JADX INFO: renamed from: ۚ, reason: not valid java name and contains not printable characters */
    public C16081 f22661;

    /* JADX INFO: renamed from: ۨ, reason: not valid java name and contains not printable characters */
    public ArrayList f22662;

    /* JADX INFO: renamed from: ۬, reason: not valid java name and contains not printable characters */
    public TextView f22663;

    /* JADX INFO: renamed from: ܰ, reason: not valid java name and contains not printable characters */
    public DialogInterfaceC19356 f22664;

    /* JADX INFO: renamed from: ᩹, reason: not valid java name and contains not printable characters */
    public ViewOnClickListenerC20314 f22665;

    public C6732(Main main, ArrayList arrayList) {
        this.f22662 = new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            this.f22662.add(new C3909(this, (PackageInfo) arrayList.get(i)));
        }
        View viewM30995 = main.m30995(R.layout.MT_Protector);
        C1439 c1439 = (C1439) viewM30995.findViewById(R.id.searchView);
        this.f22663 = (TextView) viewM30995.findViewById(R.id.MT_Protector);
        C6606 c6606 = (C6606) viewM30995.findViewById(R.id.MT_Protector);
        this.f22659 = c6606;
        C22255 c22255 = new C22255(this);
        this.f22660 = c22255;
        c6606.setAdapter((ListAdapter) c22255);
        c6606.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: l.ۖۨ֨
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                C6732.m18180(this.f9906, i2);
            }
        });
        c6606.setFastScrollEnabled(true);
        C16754.m39314(c6606);
        c1439.m5029(new C5321(this));
        C8067 c8067BuildDialog = main.buildDialog();
        c8067BuildDialog.m21258(viewM30995);
        c8067BuildDialog.m21251(R.string.MT_Protector, new DialogInterfaceOnClickListenerC2148(1, this));
        c8067BuildDialog.m21275(R.string.MT_Protector, (DialogInterface.OnClickListener) null);
        this.f22664 = c8067BuildDialog.m21252();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static /* synthetic */ void m18180(C6732 c6732, int i) {
        C22255 c22255 = c6732.f22660;
        C3909 c3909 = (C3909) c22255.f72753.get(i);
        c3909.f14605 = !c3909.f14605;
        c22255.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18179(C6732 c6732) {
        if (c6732.f22661 != null) {
            ArrayList arrayList = new ArrayList();
            for (C3909 c3909 : c6732.f22662) {
                if (c3909.f14605) {
                    arrayList.add(c3909.f14607);
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            C16081 c16081 = c6732.f22661;
            C11672.m29119((List) c16081.f52009, (C11545) c16081.f52010, arrayList);
        }
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18189(ViewOnClickListenerC20314 viewOnClickListenerC20314) {
        this.f22664.m44365(-3, C16737.m39288(R.string.MT_Protector), null);
        this.f22665 = viewOnClickListenerC20314;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18187(int i) {
        this.f22663.setText(i);
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18188(C16081 c16081) {
        this.f22661 = c16081;
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public final void m18186() {
        Button buttonM44361;
        DialogInterfaceC19356 dialogInterfaceC19356 = this.f22664;
        dialogInterfaceC19356.m44362();
        if (this.f22665 != null && (buttonM44361 = dialogInterfaceC19356.m44361()) != null) {
            buttonM44361.setOnClickListener(this.f22665);
        }
        LinkedList linkedList = new LinkedList();
        for (C3909 c3909 : this.f22662) {
            if (c3909.f14604) {
                linkedList.add(c3909);
            }
        }
        C4716.f16636.execute(new RunnableC21527(2, this, linkedList));
    }

    /* JADX INFO: renamed from: ۙ, reason: not valid java name and contains not printable characters */
    public static void m18181(C6732 c6732, LinkedList linkedList) {
        final C3909 c3909;
        while (c6732.f22664.m44375()) {
            while (!c6732.f22658.isEmpty()) {
                int iMax = Math.max(1, (c6732.f22659.getLastVisiblePosition() - c6732.f22659.getFirstVisiblePosition()) + 1);
                synchronized (c6732.f22658) {
                    while (c6732.f22658.size() > iMax) {
                        c6732.f22658.removeFirst();
                    }
                    c3909 = (C3909) c6732.f22658.removeLast();
                }
                if (c3909.f14604) {
                    c3909.f14604 = false;
                    final BitmapDrawable bitmapDrawableM51895 = RunnableC23541.m51895(c3909.f14607);
                    C16737.m39273(new Runnable() { // from class: l.۬ۨ֨
                        @Override // java.lang.Runnable
                        public final void run() {
                            C3909 c39010 = c3909;
                            C19122 c19122 = c39010.f14602;
                            boolean z = c39010.f14606;
                            BitmapDrawable bitmapDrawable = bitmapDrawableM51895;
                            if (!z) {
                                c19122.setDrawable(bitmapDrawable);
                                return;
                            }
                            Drawable drawable = c19122.getDrawable();
                            bitmapDrawable.setBounds(drawable.getBounds());
                            TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
                            c19122.setDrawable(transitionDrawable);
                            transitionDrawable.setCrossFadeEnabled(true);
                            transitionDrawable.startTransition(300);
                        }
                    });
                }
                while (c6732.f22664.m44375() && c6732.f22659.m17934()) {
                    SystemClock.sleep(100L);
                }
                if (!c6732.f22664.m44375()) {
                    return;
                }
            }
            while (!linkedList.isEmpty()) {
                if (c6732.f22658.isEmpty()) {
                    final C3909 c39010 = (C3909) linkedList.removeFirst();
                    if (c39010.f14604) {
                        c39010.f14604 = false;
                        final BitmapDrawable bitmapDrawableM51896 = RunnableC23541.m51895(c39010.f14607);
                        C16737.m39273(new Runnable() { // from class: l.۬ۨ֨
                            @Override // java.lang.Runnable
                            public final void run() {
                                C3909 c39011 = c39010;
                                C19122 c19122 = c39011.f14602;
                                boolean z = c39011.f14606;
                                BitmapDrawable bitmapDrawable = bitmapDrawableM51896;
                                if (!z) {
                                    c19122.setDrawable(bitmapDrawable);
                                    return;
                                }
                                Drawable drawable = c19122.getDrawable();
                                bitmapDrawable.setBounds(drawable.getBounds());
                                TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable, bitmapDrawable});
                                c19122.setDrawable(transitionDrawable);
                                transitionDrawable.setCrossFadeEnabled(true);
                                transitionDrawable.startTransition(300);
                            }
                        });
                    }
                    while (c6732.f22664.m44375() && c6732.f22659.m17934()) {
                        SystemClock.sleep(100L);
                    }
                    if (!c6732.f22664.m44375()) {
                        return;
                    }
                }
            }
            return;
        }
    }
}
