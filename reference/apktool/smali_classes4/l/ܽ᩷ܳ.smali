.class public final Ll/ܽ᩷ܳ;
.super Landroid/view/GestureDetector$SimpleOnGestureListener;
.source "D5GW"


# instance fields
.field public final synthetic ܰ:Ll/ۨ᩷ܳ;


# direct methods
.method public constructor <init>(Ll/ۨ᩷ܳ;)V
    .locals 0

    .line 1033
    iput-object p1, p0, Ll/ܽ᩷ܳ;->ܰ:Ll/ۨ᩷ܳ;

    invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V

    return-void
.end method


# virtual methods
.method public final onDoubleTap(Landroid/view/MotionEvent;)Z
    .locals 10

    .line 1085
    iget-object v0, p0, Ll/ܽ᩷ܳ;->ܰ:Ll/ۨ᩷ܳ;

    iget-object v1, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    iget-object v2, v0, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-int v4, v4

    int-to-long v4, v4

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->۫()J

    move-result-wide v6

    add-long/2addr v4, v6

    const/4 v6, 0x0

    .line 666
    invoke-virtual {v2, v3, v4, v5, v6}, Ll/ܳۤܳ;->ۙ(FJZ)I

    move-result v3

    .line 1086
    invoke-virtual {v2}, Ll/ܳۤܳ;->᩺()Z

    move-result v4

    .line 1087
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 1088
    invoke-virtual {v2}, Ll/ܳۤܳ;->ۗ()Z

    move-result v5

    const/4 v7, 0x1

    if-eqz v5, :cond_0

    invoke-virtual {v2}, Ll/ܳۤܳ;->᩵()Z

    move-result v5

    if-nez v5, :cond_0

    if-nez v4, :cond_0

    invoke-static {v0}, Ll/ۨ᩷ܳ;->ܳ(Ll/ۨ᩷ܳ;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 1089
    invoke-static {v0}, Ll/ۨ᩷ܳ;->᩸(Ll/ۨ᩷ܳ;)V

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return v7

    :cond_0
    if-eqz v4, :cond_1

    .line 1092
    invoke-static {v0}, Ll/ۨ᩷ܳ;->᩸(Ll/ۨ᩷ܳ;)V

    .line 1093
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 1094
    invoke-static {v0}, Ll/ۨ᩷ܳ;->۫(Ll/ۨ᩷ܳ;)V

    return v7

    .line 1097
    :cond_1
    invoke-virtual {v2}, Ll/ܳۤܳ;->ۗ()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    int-to-long v4, p1

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->۫()J

    move-result-wide v8

    add-long/2addr v4, v8

    invoke-virtual {v2, v4, v5, v3}, Ll/ܳۤܳ;->ۙ(JF)I

    move-result v3

    :cond_2
    if-ltz v3, :cond_7

    .line 1098
    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->᩸()I

    move-result p1

    if-lt v3, p1, :cond_3

    goto :goto_1

    .line 1100
    :cond_3
    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_5

    .line 1101
    invoke-virtual {v2}, Ll/ܳۤܳ;->᩵()Z

    move-result p1

    if-nez p1, :cond_4

    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result p1

    if-lt v3, p1, :cond_4

    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->۫()I

    move-result p1

    if-le v3, p1, :cond_6

    .line 1102
    :cond_4
    invoke-virtual {v1, v3, v3}, Ll/ۚ᩷ܳ;->᩷(II)V

    goto :goto_0

    .line 1105
    :cond_5
    invoke-virtual {v1, v3, v3}, Ll/ۚ᩷ܳ;->᩷(II)V

    .line 1107
    :cond_6
    :goto_0
    invoke-static {v0}, Ll/ۨ᩷ܳ;->᩸(Ll/ۨ᩷ܳ;)V

    .line 1108
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    .line 1109
    invoke-virtual {v0, v3}, Ll/ۨ᩷ܳ;->ۙ(I)Z

    move-result p1

    invoke-static {v0, p1}, Ll/ۨ᩷ܳ;->ۙ(Ll/ۨ᩷ܳ;Z)V

    return v7

    :cond_7
    :goto_1
    return v6
.end method

.method public final onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 9

    const/4 p1, 0x0

    cmpl-float p1, p4, p1

    if-eqz p1, :cond_0

    .line 1139
    iget-object p1, p0, Ll/ܽ᩷ܳ;->ܰ:Ll/ۨ᩷ܳ;

    invoke-static {p1}, Ll/ۨ᩷ܳ;->ۙ(Ll/ۨ᩷ܳ;)Ll/۠ۤܳ;

    move-result-object v0

    invoke-virtual {p1}, Ll/ۨ᩷ܳ;->۫()J

    move-result-wide v1

    neg-float p2, p4

    float-to-int p2, p2

    int-to-long v3, p2

    iget-object p2, p1, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    .line 1140
    invoke-virtual {p2}, Ll/ܳۤܳ;->ᩴ()J

    move-result-wide v5

    invoke-static {p1}, Ll/ۨ᩷ܳ;->ۤ(Ll/ۨ᩷ܳ;)I

    move-result p2

    int-to-long v7, p2

    .line 1139
    invoke-virtual/range {v0 .. v8}, Ll/۠ۤܳ;->ۙ(JJJJ)V

    .line 1141
    invoke-static {p1}, Ll/ۨ᩷ܳ;->ᩴ(Ll/ۨ᩷ܳ;)V

    .line 1142
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final onLongPress(Landroid/view/MotionEvent;)V
    .locals 1

    .line 1115
    invoke-virtual {p0, p1}, Ll/ܽ᩷ܳ;->onDoubleTap(Landroid/view/MotionEvent;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 1116
    iget-object p1, p0, Ll/ܽ᩷ܳ;->ܰ:Ll/ۨ᩷ܳ;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->performHapticFeedback(I)Z

    :cond_0
    return-void
.end method

.method public final onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 4

    const/4 p1, 0x0

    cmpl-float p1, p4, p1

    if-eqz p1, :cond_2

    .line 1122
    iget-object p1, p0, Ll/ܽ᩷ܳ;->ܰ:Ll/ۨ᩷ܳ;

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    .line 1123
    invoke-virtual {p1}, Ll/ۨ᩷ܳ;->۫()J

    move-result-wide p2

    invoke-static {p4}, Ljava/lang/Math;->round(F)I

    move-result p4

    int-to-long v0, p4

    add-long/2addr p2, v0

    .line 1124
    iget-object p4, p1, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    invoke-virtual {p4}, Ll/ܳۤܳ;->ᩴ()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long p4, p2, v2

    if-gez p4, :cond_0

    move-wide p2, v2

    goto :goto_0

    :cond_0
    cmp-long p4, p2, v0

    if-lez p4, :cond_1

    move-wide p2, v0

    .line 1129
    :cond_1
    :goto_0
    invoke-static {p1}, Ll/ۨ᩷ܳ;->ᩴ(Ll/ۨ᩷ܳ;)V

    .line 1130
    invoke-virtual {p1, p2, p3}, Ll/ۨ᩷ܳ;->ۙ(J)V

    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public final onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 9

    .line 1036
    iget-object v0, p0, Ll/ܽ᩷ܳ;->ܰ:Ll/ۨ᩷ܳ;

    iget-object v1, v0, Ll/ۨ᩷ܳ;->ۡ:Ll/ۚ᩷ܳ;

    iget-object v2, v0, Ll/ۨ᩷ܳ;->᩷ۙ:Ll/ܳۤܳ;

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v4

    float-to-int v4, v4

    int-to-long v4, v4

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->۫()J

    move-result-wide v6

    add-long/2addr v4, v6

    const/4 v6, 0x0

    .line 666
    invoke-virtual {v2, v3, v4, v5, v6}, Ll/ܳۤܳ;->ۙ(FJZ)I

    move-result v3

    .line 1038
    invoke-virtual {v2}, Ll/ܳۤܳ;->᩺()Z

    move-result v4

    .line 1039
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 1040
    invoke-virtual {v2}, Ll/ܳۤܳ;->ۗ()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v2}, Ll/ܳۤܳ;->᩵()Z

    move-result v5

    if-nez v5, :cond_0

    if-nez v4, :cond_0

    invoke-static {v0}, Ll/ۨ᩷ܳ;->ܳ(Ll/ۨ᩷ܳ;)Z

    move-result v5

    if-eqz v5, :cond_0

    .line 1041
    invoke-static {v0}, Ll/ۨ᩷ܳ;->᩸(Ll/ۨ᩷ܳ;)V

    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz v4, :cond_1

    .line 1044
    invoke-static {v0}, Ll/ۨ᩷ܳ;->۫(Ll/ۨ᩷ܳ;)V

    .line 1045
    invoke-static {v0}, Ll/ۨ᩷ܳ;->᩸(Ll/ۨ᩷ܳ;)V

    .line 1046
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return v6

    .line 1049
    :cond_1
    invoke-virtual {v2}, Ll/ܳۤܳ;->ۗ()Z

    move-result v4

    if-eqz v4, :cond_3

    .line 1050
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v3

    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result p1

    float-to-int p1, p1

    int-to-long v4, p1

    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->۫()J

    move-result-wide v7

    add-long/2addr v4, v7

    invoke-virtual {v2, v4, v5, v3}, Ll/ܳۤܳ;->ۙ(JF)I

    move-result p1

    if-gez p1, :cond_2

    return v6

    .line 1052
    :cond_2
    invoke-virtual {v2}, Ll/ܳۤܳ;->ۨ()Z

    move-result v2

    invoke-virtual {v1, p1, v2}, Ll/ۚ᩷ܳ;->ۙ(IZ)V

    .line 1053
    invoke-virtual {v0, p1}, Ll/ۨ᩷ܳ;->ۙ(I)Z

    .line 1054
    invoke-static {v0}, Ll/ۨ᩷ܳ;->᩸(Ll/ۨ᩷ܳ;)V

    .line 1055
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return v6

    .line 1058
    :cond_3
    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ۧ()Z

    move-result p1

    if-eqz p1, :cond_6

    .line 1059
    invoke-virtual {v2}, Ll/ܳۤܳ;->᩵()Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result p1

    if-lt v3, p1, :cond_5

    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->۫()I

    move-result p1

    if-le v3, p1, :cond_4

    goto :goto_0

    .line 1064
    :cond_4
    invoke-static {v0}, Ll/ۨ᩷ܳ;->۫(Ll/ۨ᩷ܳ;)V

    goto :goto_3

    .line 1060
    :cond_5
    :goto_0
    invoke-virtual {v2}, Ll/ܳۤܳ;->ۨ()Z

    move-result p1

    invoke-virtual {v1, v3, p1}, Ll/ۚ᩷ܳ;->ۙ(IZ)V

    .line 1061
    invoke-virtual {v0, v3}, Ll/ۨ᩷ܳ;->ۙ(I)Z

    .line 1062
    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->᩷()V

    goto :goto_3

    .line 1067
    :cond_6
    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->ۚ()Z

    move-result p1

    if-nez p1, :cond_9

    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->ۚ()I

    move-result p1

    if-ne p1, v3, :cond_9

    .line 1068
    invoke-virtual {v1}, Ll/ۚ᩷ܳ;->᩻()Z

    move-result p1

    invoke-virtual {v2}, Ll/ܳۤܳ;->ۨ()Z

    move-result v4

    if-eq p1, v4, :cond_7

    goto :goto_1

    .line 1072
    :cond_7
    invoke-virtual {v2}, Ll/ܳۤܳ;->᩵()Z

    move-result p1

    if-eqz p1, :cond_8

    .line 1073
    invoke-virtual {v0, v3}, Ll/ۨ᩷ܳ;->ۙ(I)Z

    goto :goto_2

    .line 1075
    :cond_8
    invoke-virtual {v0, v3}, Ll/ۨ᩷ܳ;->ۙ(I)Z

    move-result p1

    invoke-static {v0, p1}, Ll/ۨ᩷ܳ;->ۙ(Ll/ۨ᩷ܳ;Z)V

    goto :goto_2

    .line 1070
    :cond_9
    :goto_1
    invoke-virtual {v2}, Ll/ܳۤܳ;->ۨ()Z

    move-result p1

    invoke-virtual {v1, v3, p1}, Ll/ۚ᩷ܳ;->ۙ(IZ)V

    .line 1071
    invoke-virtual {v0, v3}, Ll/ۨ᩷ܳ;->ۙ(I)Z

    .line 1076
    :goto_2
    invoke-virtual {v0}, Ll/ۨ᩷ܳ;->᩷()V

    .line 1078
    :goto_3
    invoke-static {v0}, Ll/ۨ᩷ܳ;->᩸(Ll/ۨ᩷ܳ;)V

    .line 1079
    invoke-virtual {v0}, Landroid/view/View;->invalidate()V

    return v6
.end method
