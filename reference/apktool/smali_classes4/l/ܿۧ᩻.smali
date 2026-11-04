.class public final Ll/ܿۧ᩻;
.super Ljava/lang/RuntimeException;
.source "J6OY"


# instance fields
.field public final ܰ:I

.field public final ܿ:Ll/᩶ۧ᩻;

.field public final ᩶:I


# direct methods
.method public constructor <init>(IILjava/lang/String;)V
    .locals 1

    .line 13
    sget-object v0, Ll/᩶ۧ᩻;->ܿ:Ll/᩶ۧ᩻;

    invoke-direct {p0, p1, p2, p3, v0}, Ll/ܿۧ᩻;-><init>(IILjava/lang/String;Ll/᩶ۧ᩻;)V

    return-void
.end method

.method public constructor <init>(IILjava/lang/String;Ll/᩶ۧ᩻;)V
    .locals 0

    .line 17
    invoke-direct {p0, p3}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 18
    iput-object p4, p0, Ll/ܿۧ᩻;->ܿ:Ll/᩶ۧ᩻;

    .line 19
    iput p1, p0, Ll/ܿۧ᩻;->᩶:I

    .line 20
    iput p2, p0, Ll/ܿۧ᩻;->ܰ:I

    return-void
.end method


# virtual methods
.method public final ۙ()I
    .locals 1

    .line 32
    iget v0, p0, Ll/ܿۧ᩻;->ܰ:I

    return v0
.end method

.method public final ۤ()Z
    .locals 2

    .line 23
    iget-object v0, p0, Ll/ܿۧ᩻;->ܿ:Ll/᩶ۧ᩻;

    sget-object v1, Ll/᩶ۧ᩻;->᩶:Ll/᩶ۧ᩻;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public final ᩷()I
    .locals 1

    .line 28
    iget v0, p0, Ll/ܿۧ᩻;->᩶:I

    return v0
.end method

.method public final ᩸()Z
    .locals 2

    .line 25
    iget-object v0, p0, Ll/ܿۧ᩻;->ܿ:Ll/᩶ۧ᩻;

    sget-object v1, Ll/᩶ۧ᩻;->֡:Ll/᩶ۧ᩻;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
