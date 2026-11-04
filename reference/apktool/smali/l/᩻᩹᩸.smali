.class public final synthetic Ll/᩻᩹᩸;
.super Ljava/lang/Object;
.source "P6SA"

# interfaces
.implements Ll/֡ۛۙ;
.implements Ll/᩻ܶ᩵;
.implements Ll/ܽۧܺ;
.implements Ll/ۧ۫ۤ;


# instance fields
.field public final synthetic ܰ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/᩻᩹᩸;->ܰ:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 0
    iget-object v0, p0, Ll/᩻᩹᩸;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/ܽۢ᩸;

    check-cast p1, Ljava/lang/Long;

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Ll/ܽۢ᩸;->᩷(J)Ll/᩹ܽ᩵;

    move-result-object p1

    return-object p1
.end method

.method public ۙ(I)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩻᩹᩸;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/᩻ۢ۫;

    invoke-interface {v0, p1}, Ll/᩻ۢ۫;->᩷(I)V

    return-void
.end method

.method public ۙ(JLl/᩶ۨۙ;)V
    .locals 1

    .line 0
    iget-object v0, p0, Ll/᩻᩹᩸;->ܰ:Ljava/lang/Object;

    check-cast v0, Ll/ᩳ᩵᩷;

    invoke-static {v0, p1, p2, p3}, Ll/ᩳ᩵᩷;->ۙ(Ll/ᩳ᩵᩷;JLl/᩶ۨۙ;)V

    return-void
.end method

.method public ۙ(Ljava/lang/String;)Z
    .locals 1

    .line 2
    iget-object v0, p0, Ll/᩻᩹᩸;->ܰ:Ljava/lang/Object;

    .line 4
    check-cast v0, Ljava/lang/String;

    .line 1082
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
