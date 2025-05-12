
package org.tempuri;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;
import org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetCiviciFPointBase;
import org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetCiviciFPointExtended;
import org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetCivicoChange;
import org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetCivicoFidc;
import org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetCivicoReplace;
import org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetCivicoStory;
import org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetData;
import org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetInfo;
import org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetTipoVia;
import org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetValue;
import org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetViaFCode;
import org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetViaFCodeExtended;
import org.datacontract.schemas._2004._07.wcftopo.TopoServiceTypeGetVieFTopo;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _SitGetDataPToken_QNAME = new QName("http://tempuri.org/", "pToken");
    private static final QName _SitGetDataPRiferimento_QNAME = new QName("http://tempuri.org/", "pRiferimento");
    private static final QName _SitGetDataResponseSitGetDataResult_QNAME = new QName("http://tempuri.org/", "sitGetDataResult");
    private static final QName _SitGetInfoResponseSitGetInfoResult_QNAME = new QName("http://tempuri.org/", "sitGetInfoResult");
    private static final QName _SitGetCiviciFPointBaseResponseSitGetCiviciFPointBaseResult_QNAME = new QName("http://tempuri.org/", "sitGetCiviciFPointBaseResult");
    private static final QName _SitGetCiviciFPointExtendedResponseSitGetCiviciFPointExtendedResult_QNAME = new QName("http://tempuri.org/", "sitGetCiviciFPointExtendedResult");
    private static final QName _SitGetVieFTopoPToponomy_QNAME = new QName("http://tempuri.org/", "pToponomy");
    private static final QName _SitGetVieFTopoPType_QNAME = new QName("http://tempuri.org/", "pType");
    private static final QName _SitGetVieFTopoResponseSitGetVieFTopoResult_QNAME = new QName("http://tempuri.org/", "sitGetVieFTopoResult");
    private static final QName _SitGetViaFCodePCivic_QNAME = new QName("http://tempuri.org/", "pCivic");
    private static final QName _SitGetViaFCodeResponseSitGetViaFCodeResult_QNAME = new QName("http://tempuri.org/", "sitGetViaFCodeResult");
    private static final QName _SitGetViaFCodeExtendedResponseSitGetViaFCodeExtendedResult_QNAME = new QName("http://tempuri.org/", "sitGetViaFCodeExtendedResult");
    private static final QName _SitGetCivicoFidcResponseSitGetCivicoFidcResult_QNAME = new QName("http://tempuri.org/", "sitGetCivicoFidcResult");
    private static final QName _SitGetCivicoStoryPData1_QNAME = new QName("http://tempuri.org/", "pData1");
    private static final QName _SitGetCivicoStoryPData2_QNAME = new QName("http://tempuri.org/", "pData2");
    private static final QName _SitGetCivicoStoryResponseSitGetCivicoStoryResult_QNAME = new QName("http://tempuri.org/", "sitGetCivicoStoryResult");
    private static final QName _SitGetCivicoChangeResponseSitGetCivicoChangeResult_QNAME = new QName("http://tempuri.org/", "sitGetCivicoChangeResult");
    private static final QName _SitGetTipoViaResponseSitGetTipoViaResult_QNAME = new QName("http://tempuri.org/", "sitGetTipoViaResult");
    private static final QName _SitGetValueFPointPCode_QNAME = new QName("http://tempuri.org/", "pCode");
    private static final QName _SitGetValueFPointResponseSitGetValueFPointResult_QNAME = new QName("http://tempuri.org/", "sitGetValueFPointResult");
    private static final QName _SitGetValueFidcResponseSitGetValueFidcResult_QNAME = new QName("http://tempuri.org/", "sitGetValueFidcResult");
    private static final QName _SitGetValueFPolygonPPolygonJson_QNAME = new QName("http://tempuri.org/", "pPolygonJson");
    private static final QName _SitGetValueFPolygonResponseSitGetValueFPolygonResult_QNAME = new QName("http://tempuri.org/", "sitGetValueFPolygonResult");
    private static final QName _SitGetCivicoReplaceResponseSitGetCivicoReplaceResult_QNAME = new QName("http://tempuri.org/", "sitGetCivicoReplaceResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SitGetData }
     * 
     * @return
     *     the new instance of {@link SitGetData }
     */
    public SitGetData createSitGetData() {
        return new SitGetData();
    }

    /**
     * Create an instance of {@link SitGetDataResponse }
     * 
     * @return
     *     the new instance of {@link SitGetDataResponse }
     */
    public SitGetDataResponse createSitGetDataResponse() {
        return new SitGetDataResponse();
    }

    /**
     * Create an instance of {@link SitGetInfo }
     * 
     * @return
     *     the new instance of {@link SitGetInfo }
     */
    public SitGetInfo createSitGetInfo() {
        return new SitGetInfo();
    }

    /**
     * Create an instance of {@link SitGetInfoResponse }
     * 
     * @return
     *     the new instance of {@link SitGetInfoResponse }
     */
    public SitGetInfoResponse createSitGetInfoResponse() {
        return new SitGetInfoResponse();
    }

    /**
     * Create an instance of {@link SitGetCiviciFPointBase }
     * 
     * @return
     *     the new instance of {@link SitGetCiviciFPointBase }
     */
    public SitGetCiviciFPointBase createSitGetCiviciFPointBase() {
        return new SitGetCiviciFPointBase();
    }

    /**
     * Create an instance of {@link SitGetCiviciFPointBaseResponse }
     * 
     * @return
     *     the new instance of {@link SitGetCiviciFPointBaseResponse }
     */
    public SitGetCiviciFPointBaseResponse createSitGetCiviciFPointBaseResponse() {
        return new SitGetCiviciFPointBaseResponse();
    }

    /**
     * Create an instance of {@link SitGetCiviciFPointExtended }
     * 
     * @return
     *     the new instance of {@link SitGetCiviciFPointExtended }
     */
    public SitGetCiviciFPointExtended createSitGetCiviciFPointExtended() {
        return new SitGetCiviciFPointExtended();
    }

    /**
     * Create an instance of {@link SitGetCiviciFPointExtendedResponse }
     * 
     * @return
     *     the new instance of {@link SitGetCiviciFPointExtendedResponse }
     */
    public SitGetCiviciFPointExtendedResponse createSitGetCiviciFPointExtendedResponse() {
        return new SitGetCiviciFPointExtendedResponse();
    }

    /**
     * Create an instance of {@link SitGetVieFTopo }
     * 
     * @return
     *     the new instance of {@link SitGetVieFTopo }
     */
    public SitGetVieFTopo createSitGetVieFTopo() {
        return new SitGetVieFTopo();
    }

    /**
     * Create an instance of {@link SitGetVieFTopoResponse }
     * 
     * @return
     *     the new instance of {@link SitGetVieFTopoResponse }
     */
    public SitGetVieFTopoResponse createSitGetVieFTopoResponse() {
        return new SitGetVieFTopoResponse();
    }

    /**
     * Create an instance of {@link SitGetViaFCode }
     * 
     * @return
     *     the new instance of {@link SitGetViaFCode }
     */
    public SitGetViaFCode createSitGetViaFCode() {
        return new SitGetViaFCode();
    }

    /**
     * Create an instance of {@link SitGetViaFCodeResponse }
     * 
     * @return
     *     the new instance of {@link SitGetViaFCodeResponse }
     */
    public SitGetViaFCodeResponse createSitGetViaFCodeResponse() {
        return new SitGetViaFCodeResponse();
    }

    /**
     * Create an instance of {@link SitGetViaFCodeExtended }
     * 
     * @return
     *     the new instance of {@link SitGetViaFCodeExtended }
     */
    public SitGetViaFCodeExtended createSitGetViaFCodeExtended() {
        return new SitGetViaFCodeExtended();
    }

    /**
     * Create an instance of {@link SitGetViaFCodeExtendedResponse }
     * 
     * @return
     *     the new instance of {@link SitGetViaFCodeExtendedResponse }
     */
    public SitGetViaFCodeExtendedResponse createSitGetViaFCodeExtendedResponse() {
        return new SitGetViaFCodeExtendedResponse();
    }

    /**
     * Create an instance of {@link SitGetCivicoFidc }
     * 
     * @return
     *     the new instance of {@link SitGetCivicoFidc }
     */
    public SitGetCivicoFidc createSitGetCivicoFidc() {
        return new SitGetCivicoFidc();
    }

    /**
     * Create an instance of {@link SitGetCivicoFidcResponse }
     * 
     * @return
     *     the new instance of {@link SitGetCivicoFidcResponse }
     */
    public SitGetCivicoFidcResponse createSitGetCivicoFidcResponse() {
        return new SitGetCivicoFidcResponse();
    }

    /**
     * Create an instance of {@link SitGetCivicoStory }
     * 
     * @return
     *     the new instance of {@link SitGetCivicoStory }
     */
    public SitGetCivicoStory createSitGetCivicoStory() {
        return new SitGetCivicoStory();
    }

    /**
     * Create an instance of {@link SitGetCivicoStoryResponse }
     * 
     * @return
     *     the new instance of {@link SitGetCivicoStoryResponse }
     */
    public SitGetCivicoStoryResponse createSitGetCivicoStoryResponse() {
        return new SitGetCivicoStoryResponse();
    }

    /**
     * Create an instance of {@link SitGetCivicoChange }
     * 
     * @return
     *     the new instance of {@link SitGetCivicoChange }
     */
    public SitGetCivicoChange createSitGetCivicoChange() {
        return new SitGetCivicoChange();
    }

    /**
     * Create an instance of {@link SitGetCivicoChangeResponse }
     * 
     * @return
     *     the new instance of {@link SitGetCivicoChangeResponse }
     */
    public SitGetCivicoChangeResponse createSitGetCivicoChangeResponse() {
        return new SitGetCivicoChangeResponse();
    }

    /**
     * Create an instance of {@link SitGetTipoVia }
     * 
     * @return
     *     the new instance of {@link SitGetTipoVia }
     */
    public SitGetTipoVia createSitGetTipoVia() {
        return new SitGetTipoVia();
    }

    /**
     * Create an instance of {@link SitGetTipoViaResponse }
     * 
     * @return
     *     the new instance of {@link SitGetTipoViaResponse }
     */
    public SitGetTipoViaResponse createSitGetTipoViaResponse() {
        return new SitGetTipoViaResponse();
    }

    /**
     * Create an instance of {@link SitGetValueFPoint }
     * 
     * @return
     *     the new instance of {@link SitGetValueFPoint }
     */
    public SitGetValueFPoint createSitGetValueFPoint() {
        return new SitGetValueFPoint();
    }

    /**
     * Create an instance of {@link SitGetValueFPointResponse }
     * 
     * @return
     *     the new instance of {@link SitGetValueFPointResponse }
     */
    public SitGetValueFPointResponse createSitGetValueFPointResponse() {
        return new SitGetValueFPointResponse();
    }

    /**
     * Create an instance of {@link SitGetValueFidc }
     * 
     * @return
     *     the new instance of {@link SitGetValueFidc }
     */
    public SitGetValueFidc createSitGetValueFidc() {
        return new SitGetValueFidc();
    }

    /**
     * Create an instance of {@link SitGetValueFidcResponse }
     * 
     * @return
     *     the new instance of {@link SitGetValueFidcResponse }
     */
    public SitGetValueFidcResponse createSitGetValueFidcResponse() {
        return new SitGetValueFidcResponse();
    }

    /**
     * Create an instance of {@link SitGetValueFPolygon }
     * 
     * @return
     *     the new instance of {@link SitGetValueFPolygon }
     */
    public SitGetValueFPolygon createSitGetValueFPolygon() {
        return new SitGetValueFPolygon();
    }

    /**
     * Create an instance of {@link SitGetValueFPolygonResponse }
     * 
     * @return
     *     the new instance of {@link SitGetValueFPolygonResponse }
     */
    public SitGetValueFPolygonResponse createSitGetValueFPolygonResponse() {
        return new SitGetValueFPolygonResponse();
    }

    /**
     * Create an instance of {@link SitGetCivicoReplace }
     * 
     * @return
     *     the new instance of {@link SitGetCivicoReplace }
     */
    public SitGetCivicoReplace createSitGetCivicoReplace() {
        return new SitGetCivicoReplace();
    }

    /**
     * Create an instance of {@link SitGetCivicoReplaceResponse }
     * 
     * @return
     *     the new instance of {@link SitGetCivicoReplaceResponse }
     */
    public SitGetCivicoReplaceResponse createSitGetCivicoReplaceResponse() {
        return new SitGetCivicoReplaceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pToken", scope = SitGetData.class)
    public JAXBElement<String> createSitGetDataPToken(String value) {
        return new JAXBElement<>(_SitGetDataPToken_QNAME, String.class, SitGetData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pRiferimento", scope = SitGetData.class)
    public JAXBElement<String> createSitGetDataPRiferimento(String value) {
        return new JAXBElement<>(_SitGetDataPRiferimento_QNAME, String.class, SitGetData.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetData }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetData }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sitGetDataResult", scope = SitGetDataResponse.class)
    public JAXBElement<TopoServiceTypeGetData> createSitGetDataResponseSitGetDataResult(TopoServiceTypeGetData value) {
        return new JAXBElement<>(_SitGetDataResponseSitGetDataResult_QNAME, TopoServiceTypeGetData.class, SitGetDataResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pToken", scope = SitGetInfo.class)
    public JAXBElement<String> createSitGetInfoPToken(String value) {
        return new JAXBElement<>(_SitGetDataPToken_QNAME, String.class, SitGetInfo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetInfo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetInfo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sitGetInfoResult", scope = SitGetInfoResponse.class)
    public JAXBElement<TopoServiceTypeGetInfo> createSitGetInfoResponseSitGetInfoResult(TopoServiceTypeGetInfo value) {
        return new JAXBElement<>(_SitGetInfoResponseSitGetInfoResult_QNAME, TopoServiceTypeGetInfo.class, SitGetInfoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pToken", scope = SitGetCiviciFPointBase.class)
    public JAXBElement<String> createSitGetCiviciFPointBasePToken(String value) {
        return new JAXBElement<>(_SitGetDataPToken_QNAME, String.class, SitGetCiviciFPointBase.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetCiviciFPointBase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetCiviciFPointBase }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sitGetCiviciFPointBaseResult", scope = SitGetCiviciFPointBaseResponse.class)
    public JAXBElement<TopoServiceTypeGetCiviciFPointBase> createSitGetCiviciFPointBaseResponseSitGetCiviciFPointBaseResult(TopoServiceTypeGetCiviciFPointBase value) {
        return new JAXBElement<>(_SitGetCiviciFPointBaseResponseSitGetCiviciFPointBaseResult_QNAME, TopoServiceTypeGetCiviciFPointBase.class, SitGetCiviciFPointBaseResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pToken", scope = SitGetCiviciFPointExtended.class)
    public JAXBElement<String> createSitGetCiviciFPointExtendedPToken(String value) {
        return new JAXBElement<>(_SitGetDataPToken_QNAME, String.class, SitGetCiviciFPointExtended.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetCiviciFPointExtended }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetCiviciFPointExtended }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sitGetCiviciFPointExtendedResult", scope = SitGetCiviciFPointExtendedResponse.class)
    public JAXBElement<TopoServiceTypeGetCiviciFPointExtended> createSitGetCiviciFPointExtendedResponseSitGetCiviciFPointExtendedResult(TopoServiceTypeGetCiviciFPointExtended value) {
        return new JAXBElement<>(_SitGetCiviciFPointExtendedResponseSitGetCiviciFPointExtendedResult_QNAME, TopoServiceTypeGetCiviciFPointExtended.class, SitGetCiviciFPointExtendedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pToken", scope = SitGetVieFTopo.class)
    public JAXBElement<String> createSitGetVieFTopoPToken(String value) {
        return new JAXBElement<>(_SitGetDataPToken_QNAME, String.class, SitGetVieFTopo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pToponomy", scope = SitGetVieFTopo.class)
    public JAXBElement<String> createSitGetVieFTopoPToponomy(String value) {
        return new JAXBElement<>(_SitGetVieFTopoPToponomy_QNAME, String.class, SitGetVieFTopo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pType", scope = SitGetVieFTopo.class)
    public JAXBElement<String> createSitGetVieFTopoPType(String value) {
        return new JAXBElement<>(_SitGetVieFTopoPType_QNAME, String.class, SitGetVieFTopo.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetVieFTopo }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetVieFTopo }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sitGetVieFTopoResult", scope = SitGetVieFTopoResponse.class)
    public JAXBElement<TopoServiceTypeGetVieFTopo> createSitGetVieFTopoResponseSitGetVieFTopoResult(TopoServiceTypeGetVieFTopo value) {
        return new JAXBElement<>(_SitGetVieFTopoResponseSitGetVieFTopoResult_QNAME, TopoServiceTypeGetVieFTopo.class, SitGetVieFTopoResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pToken", scope = SitGetViaFCode.class)
    public JAXBElement<String> createSitGetViaFCodePToken(String value) {
        return new JAXBElement<>(_SitGetDataPToken_QNAME, String.class, SitGetViaFCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pCivic", scope = SitGetViaFCode.class)
    public JAXBElement<String> createSitGetViaFCodePCivic(String value) {
        return new JAXBElement<>(_SitGetViaFCodePCivic_QNAME, String.class, SitGetViaFCode.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetViaFCode }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetViaFCode }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sitGetViaFCodeResult", scope = SitGetViaFCodeResponse.class)
    public JAXBElement<TopoServiceTypeGetViaFCode> createSitGetViaFCodeResponseSitGetViaFCodeResult(TopoServiceTypeGetViaFCode value) {
        return new JAXBElement<>(_SitGetViaFCodeResponseSitGetViaFCodeResult_QNAME, TopoServiceTypeGetViaFCode.class, SitGetViaFCodeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pToken", scope = SitGetViaFCodeExtended.class)
    public JAXBElement<String> createSitGetViaFCodeExtendedPToken(String value) {
        return new JAXBElement<>(_SitGetDataPToken_QNAME, String.class, SitGetViaFCodeExtended.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pCivic", scope = SitGetViaFCodeExtended.class)
    public JAXBElement<String> createSitGetViaFCodeExtendedPCivic(String value) {
        return new JAXBElement<>(_SitGetViaFCodePCivic_QNAME, String.class, SitGetViaFCodeExtended.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetViaFCodeExtended }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetViaFCodeExtended }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sitGetViaFCodeExtendedResult", scope = SitGetViaFCodeExtendedResponse.class)
    public JAXBElement<TopoServiceTypeGetViaFCodeExtended> createSitGetViaFCodeExtendedResponseSitGetViaFCodeExtendedResult(TopoServiceTypeGetViaFCodeExtended value) {
        return new JAXBElement<>(_SitGetViaFCodeExtendedResponseSitGetViaFCodeExtendedResult_QNAME, TopoServiceTypeGetViaFCodeExtended.class, SitGetViaFCodeExtendedResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pToken", scope = SitGetCivicoFidc.class)
    public JAXBElement<String> createSitGetCivicoFidcPToken(String value) {
        return new JAXBElement<>(_SitGetDataPToken_QNAME, String.class, SitGetCivicoFidc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetCivicoFidc }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetCivicoFidc }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sitGetCivicoFidcResult", scope = SitGetCivicoFidcResponse.class)
    public JAXBElement<TopoServiceTypeGetCivicoFidc> createSitGetCivicoFidcResponseSitGetCivicoFidcResult(TopoServiceTypeGetCivicoFidc value) {
        return new JAXBElement<>(_SitGetCivicoFidcResponseSitGetCivicoFidcResult_QNAME, TopoServiceTypeGetCivicoFidc.class, SitGetCivicoFidcResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pToken", scope = SitGetCivicoStory.class)
    public JAXBElement<String> createSitGetCivicoStoryPToken(String value) {
        return new JAXBElement<>(_SitGetDataPToken_QNAME, String.class, SitGetCivicoStory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pData1", scope = SitGetCivicoStory.class)
    public JAXBElement<String> createSitGetCivicoStoryPData1(String value) {
        return new JAXBElement<>(_SitGetCivicoStoryPData1_QNAME, String.class, SitGetCivicoStory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pData2", scope = SitGetCivicoStory.class)
    public JAXBElement<String> createSitGetCivicoStoryPData2(String value) {
        return new JAXBElement<>(_SitGetCivicoStoryPData2_QNAME, String.class, SitGetCivicoStory.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetCivicoStory }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetCivicoStory }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sitGetCivicoStoryResult", scope = SitGetCivicoStoryResponse.class)
    public JAXBElement<TopoServiceTypeGetCivicoStory> createSitGetCivicoStoryResponseSitGetCivicoStoryResult(TopoServiceTypeGetCivicoStory value) {
        return new JAXBElement<>(_SitGetCivicoStoryResponseSitGetCivicoStoryResult_QNAME, TopoServiceTypeGetCivicoStory.class, SitGetCivicoStoryResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pToken", scope = SitGetCivicoChange.class)
    public JAXBElement<String> createSitGetCivicoChangePToken(String value) {
        return new JAXBElement<>(_SitGetDataPToken_QNAME, String.class, SitGetCivicoChange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pData1", scope = SitGetCivicoChange.class)
    public JAXBElement<String> createSitGetCivicoChangePData1(String value) {
        return new JAXBElement<>(_SitGetCivicoStoryPData1_QNAME, String.class, SitGetCivicoChange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pData2", scope = SitGetCivicoChange.class)
    public JAXBElement<String> createSitGetCivicoChangePData2(String value) {
        return new JAXBElement<>(_SitGetCivicoStoryPData2_QNAME, String.class, SitGetCivicoChange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetCivicoChange }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetCivicoChange }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sitGetCivicoChangeResult", scope = SitGetCivicoChangeResponse.class)
    public JAXBElement<TopoServiceTypeGetCivicoChange> createSitGetCivicoChangeResponseSitGetCivicoChangeResult(TopoServiceTypeGetCivicoChange value) {
        return new JAXBElement<>(_SitGetCivicoChangeResponseSitGetCivicoChangeResult_QNAME, TopoServiceTypeGetCivicoChange.class, SitGetCivicoChangeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pToken", scope = SitGetTipoVia.class)
    public JAXBElement<String> createSitGetTipoViaPToken(String value) {
        return new JAXBElement<>(_SitGetDataPToken_QNAME, String.class, SitGetTipoVia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pType", scope = SitGetTipoVia.class)
    public JAXBElement<String> createSitGetTipoViaPType(String value) {
        return new JAXBElement<>(_SitGetVieFTopoPType_QNAME, String.class, SitGetTipoVia.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetTipoVia }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetTipoVia }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sitGetTipoViaResult", scope = SitGetTipoViaResponse.class)
    public JAXBElement<TopoServiceTypeGetTipoVia> createSitGetTipoViaResponseSitGetTipoViaResult(TopoServiceTypeGetTipoVia value) {
        return new JAXBElement<>(_SitGetTipoViaResponseSitGetTipoViaResult_QNAME, TopoServiceTypeGetTipoVia.class, SitGetTipoViaResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pToken", scope = SitGetValueFPoint.class)
    public JAXBElement<String> createSitGetValueFPointPToken(String value) {
        return new JAXBElement<>(_SitGetDataPToken_QNAME, String.class, SitGetValueFPoint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pCode", scope = SitGetValueFPoint.class)
    public JAXBElement<String> createSitGetValueFPointPCode(String value) {
        return new JAXBElement<>(_SitGetValueFPointPCode_QNAME, String.class, SitGetValueFPoint.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sitGetValueFPointResult", scope = SitGetValueFPointResponse.class)
    public JAXBElement<TopoServiceTypeGetValue> createSitGetValueFPointResponseSitGetValueFPointResult(TopoServiceTypeGetValue value) {
        return new JAXBElement<>(_SitGetValueFPointResponseSitGetValueFPointResult_QNAME, TopoServiceTypeGetValue.class, SitGetValueFPointResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pToken", scope = SitGetValueFidc.class)
    public JAXBElement<String> createSitGetValueFidcPToken(String value) {
        return new JAXBElement<>(_SitGetDataPToken_QNAME, String.class, SitGetValueFidc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pCode", scope = SitGetValueFidc.class)
    public JAXBElement<String> createSitGetValueFidcPCode(String value) {
        return new JAXBElement<>(_SitGetValueFPointPCode_QNAME, String.class, SitGetValueFidc.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sitGetValueFidcResult", scope = SitGetValueFidcResponse.class)
    public JAXBElement<TopoServiceTypeGetValue> createSitGetValueFidcResponseSitGetValueFidcResult(TopoServiceTypeGetValue value) {
        return new JAXBElement<>(_SitGetValueFidcResponseSitGetValueFidcResult_QNAME, TopoServiceTypeGetValue.class, SitGetValueFidcResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pToken", scope = SitGetValueFPolygon.class)
    public JAXBElement<String> createSitGetValueFPolygonPToken(String value) {
        return new JAXBElement<>(_SitGetDataPToken_QNAME, String.class, SitGetValueFPolygon.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pCode", scope = SitGetValueFPolygon.class)
    public JAXBElement<String> createSitGetValueFPolygonPCode(String value) {
        return new JAXBElement<>(_SitGetValueFPointPCode_QNAME, String.class, SitGetValueFPolygon.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pPolygonJson", scope = SitGetValueFPolygon.class)
    public JAXBElement<String> createSitGetValueFPolygonPPolygonJson(String value) {
        return new JAXBElement<>(_SitGetValueFPolygonPPolygonJson_QNAME, String.class, SitGetValueFPolygon.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetValue }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetValue }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sitGetValueFPolygonResult", scope = SitGetValueFPolygonResponse.class)
    public JAXBElement<TopoServiceTypeGetValue> createSitGetValueFPolygonResponseSitGetValueFPolygonResult(TopoServiceTypeGetValue value) {
        return new JAXBElement<>(_SitGetValueFPolygonResponseSitGetValueFPolygonResult_QNAME, TopoServiceTypeGetValue.class, SitGetValueFPolygonResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "pToken", scope = SitGetCivicoReplace.class)
    public JAXBElement<String> createSitGetCivicoReplacePToken(String value) {
        return new JAXBElement<>(_SitGetDataPToken_QNAME, String.class, SitGetCivicoReplace.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetCivicoReplace }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TopoServiceTypeGetCivicoReplace }{@code >}
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "sitGetCivicoReplaceResult", scope = SitGetCivicoReplaceResponse.class)
    public JAXBElement<TopoServiceTypeGetCivicoReplace> createSitGetCivicoReplaceResponseSitGetCivicoReplaceResult(TopoServiceTypeGetCivicoReplace value) {
        return new JAXBElement<>(_SitGetCivicoReplaceResponseSitGetCivicoReplaceResult_QNAME, TopoServiceTypeGetCivicoReplace.class, SitGetCivicoReplaceResponse.class, value);
    }

}
