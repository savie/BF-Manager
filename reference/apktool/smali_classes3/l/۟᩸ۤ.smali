.class public final synthetic Ll/۟᩸ۤ;
.super Ljava/lang/Object;
.source "J63D"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ܰ:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/۟᩸ۤ;->ܰ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 2
    iget v0, p0, Ll/۟᩸ۤ;->ܰ:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Ll/ۛ᩷۫;

    .line 9
    check-cast p2, Ll/ۛ᩷۫;

    .line 1557
    invoke-virtual {p1}, Ll/ۛ᩷۫;->ܶ()Z

    move-result v0

    invoke-virtual {p2}, Ll/ۛ᩷۫;->ܶ()Z

    move-result v1

    if-eq v0, v1, :cond_2

    .line 1558
    invoke-virtual {p1}, Ll/ۛ᩷۫;->ܶ()Z

    move-result p1

    if-eqz p1, :cond_6

    goto :goto_1

    .line 0
    :pswitch_0
    check-cast p1, Ll/᩻۫ۤ;

    check-cast p2, Ll/᩻۫ۤ;

    .line 96
    iget v0, p1, Ll/᩻۫ۤ;->᩷:I

    iget v1, p2, Ll/᩻۫ۤ;->᩷:I

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 99
    :cond_0
    iget v0, p2, Ll/᩻۫ۤ;->ۙ:I

    iget v1, p1, Ll/᩻۫ۤ;->ۙ:I

    invoke-static {v0, v1}, Ljava/lang/Integer;->compare(II)I

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 102
    :cond_1
    iget-object p1, p1, Ll/᩻۫ۤ;->ۤ:Ljava/lang/String;

    iget-object p2, p2, Ll/᩻۫ۤ;->ۤ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v0

    :goto_0
    return v0

    .line 1561
    :cond_2
    invoke-virtual {p1}, Ll/ۛ᩷۫;->ܶ()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 1562
    invoke-virtual {p1}, Ll/ۛ᩷۫;->ܳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ll/ۛ᩷۫;->ܳ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    goto :goto_2

    .line 1565
    :cond_3
    invoke-virtual {p1}, Ll/ۛ᩷۫;->᩵()Z

    move-result v0

    invoke-virtual {p2}, Ll/ۛ᩷۫;->᩵()Z

    move-result v1

    if-eq v0, v1, :cond_4

    .line 1566
    invoke-virtual {p1}, Ll/ۛ᩷۫;->᩵()Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_1

    .line 1569
    :cond_4
    invoke-virtual {p1}, Ll/ۛ᩷۫;->᩵()Z

    move-result v0

    if-nez v0, :cond_5

    .line 1570
    invoke-virtual {p1}, Ll/ۛ᩷۫;->ܳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ll/ۛ᩷۫;->ܳ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    goto :goto_2

    .line 1573
    :cond_5
    invoke-virtual {p1}, Ll/ۛ᩷۫;->᩹()Z

    move-result v0

    invoke-virtual {p2}, Ll/ۛ᩷۫;->᩹()Z

    move-result v1

    if-eq v0, v1, :cond_7

    .line 1574
    invoke-virtual {p1}, Ll/ۛ᩷۫;->᩹()Z

    move-result p1

    if-nez p1, :cond_6

    :goto_1
    const/4 p1, -0x1

    goto :goto_2

    :cond_6
    const/4 p1, 0x1

    goto :goto_2

    .line 1577
    :cond_7
    invoke-virtual {p1}, Ll/ۛ᩷۫;->ܳ()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Ll/ۛ᩷۫;->ܳ()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p1

    :goto_2
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
