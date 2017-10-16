package situ.bld.util;

import java.util.ArrayList;
import java.util.Collection;


public class User_ArrayList extends ArrayList<Object> {
	public User_ArrayList(Collection<? extends Object> arg0) {
		super(arg0);
	}
	public User_ArrayList() {
		// TODO Auto-generated constructor stub
	}
	public byte[] GetBytes() {
		try {
			int alllen = 0;
			if (this != null && this.size() > 0) {
				byte[] alldata = new byte[10000];
				for (int i = 0; i < this.size(); i++) {
					int len = 0;
					Object obj = this.get(i);
					byte[] data = null;
					byte bz = 0;
					if (obj == null) {
						data = new byte[0];
						len = 0;
						bz = 0;
					}
					if (obj instanceof String) {
						data = obj.toString().getBytes("UTF-8");
						len = data.length;
						bz = 1;
						
					}
					if (obj instanceof Integer) {
						data = Convert_Type.int2Byte(((Integer) obj).intValue());
						len = data.length;
						bz = 3;
					}

					if (obj instanceof Double) {
						data = Convert_Type.double2bytes(((Double) obj)
								.doubleValue());
						len = data.length;
						bz = 4;
					}

					if (obj instanceof Character) {
						data = Convert_Type.charToByte(((Character) obj)
								.charValue());
						len = data.length;
						bz = 5;
					}

					if (obj instanceof Boolean) {
						data = Convert_Type.BoolToByte(((Boolean) obj)
								.booleanValue());
						len = data.length;
						bz = 6;
					}
					// 7 uint
					if (obj instanceof Long) {
						data = Convert_Type.longToByte8(((Long) obj)
								.longValue());
						len = data.length;
						bz = 8;
					}
					if (obj instanceof User_ArrayList) {
						User_ArrayList list = (User_ArrayList) obj;
						data = list.GetBytes();
						len = data.length;
						bz = 12;
					}

					if (obj instanceof byte[]) {
						data = (byte[]) obj;
						len = data.length;
						bz = 16;
					}

					byte[] blen = Convert_Type.int2Byte(len);
					System.arraycopy(blen, 0, alldata, alllen, 4);
					alldata[alllen + 4] = bz;
					System.arraycopy(data, 0, alldata, alllen + 5, data.length);
					alllen += data.length + 5;
				}
				byte[] aal = new byte[alllen];
				System.arraycopy(alldata, 0, aal, 0, alllen);
				return aal;
			}
		} catch (Exception e) {
			return new byte[0];
		}
		return new byte[0];
	}

	public void SetBytes(byte[] data) {
		try {
			this.clear();
			if (data.length == 0)
				return;
			int pos = 0;
			ReturnType ret = new ReturnType();
			Object obj = null;
			while (true) {
				ret = getdata(data, pos);
				switch (ret.type) {
				case 0:
					obj = null;
					break;
				case 1:
					obj = new String(ret.data, 0, ret.data.length, "UTF-8");
					break;
				case 2:
					break;
				case 3:
					obj = new Integer(Convert_Type.byte2Int(ret.data));
					break;
				case 4:
					obj = new Double(Convert_Type.bytes2double(ret.data));
					break;
				case 5:
					obj = new Character(Convert_Type.byteToChar(ret.data));
					break;
				case 6:
					obj = new Boolean(Convert_Type.byteToBool(ret.data));
					break;
				case 7:
					obj = new Integer(Convert_Type.byte2Int(ret.data));
					break;
				case 8:
					obj = new Long(Convert_Type.byteToLong(ret.data));
					break;
				case 9:
					obj = new Long(Convert_Type.byteToLong(ret.data));
					break;
				
				case 12:
					User_ArrayList list = new User_ArrayList();
					list.SetBytes(ret.data);
					obj = list;
					break;
				case 16:
					obj = ret.data;
					break;
				}

				this.add(obj);
				if (ret.despos >= data.length)
					break;
				pos = ret.despos;
			}
		} catch (Exception e) {
		}
	}

	private ReturnType getdata(byte[] data, int pos) {
		ReturnType ret = new ReturnType();
		int mylen = Convert_Type.byte2Int(data, pos);
		byte[] mydata = new byte[mylen];
		System.arraycopy(data, pos + 5, mydata, 0, mylen);
		ret.despos = pos + 5 + mylen;
		ret.type = data[pos + 4];
		ret.data = mydata;
		return ret;
	}

	class ReturnType {
		public int despos = 0;
		public byte type = 0;
		public byte[] data = new byte[0];
	}
}
  class Convert_Type {
		/**
		 * 整型转换为4位字节数组
		 * 
		 * @param intValue
		 * @return
		 */
		public static byte[] int2Byte(int intValue) {
			byte[] b = new byte[4];
			for (int i = 0; i < 4; i++) {
				b[i] = (byte) (intValue >> 8 * i & 0xFF);
			}
			return b;
		}

		/**
		 * 4位字节数组转换为整型
		 * 
		 * @param b
		 * @return
		 */
		public static int byte2Int(byte[] b) {
			int intValue = 0;
			for (int i = 0; i < 4; i++) {
				intValue += (b[i] & 0xFF) << (8 * i);
			}
			return intValue;
		}

		public static int byte2Int(byte[] b, int starpos) {
			int intValue = 0;
			for (int i = 0; i < 4; i++) {
				intValue += (b[i + starpos] & 0xFF) << (8 * i);
			}
			return intValue;
		}

		public static byte[] double2bytes(double num) {
			long nums = Double.doubleToLongBits(num);
			byte[] bytes = new byte[8];
			for (int i = 0; i < 8; i++) {
				bytes[7 - i] = (byte) (nums >>> (56 - (i * 8)));
			}
			return bytes;
		}

		public static double bytes2double(byte[] b) {
			double doubleValue = 0;
			long nums = 0;
			long temp = 0;
			for (int i = 0; i < 8; i++) {
				nums <<= 8;
				temp = b[7 - i] & 0xff;
				nums |= temp;
			}
			doubleValue = Double.longBitsToDouble(nums);
			return doubleValue;
		}

		public static byte[] charToByte(char ch) {
			int temp = (int) ch;
			byte[] b = new byte[2];
			for (int i = 0; i < 2; i++) {
				b[i] = (byte) (temp >> 8 * i & 0xFF);
			}
			return b;
		}

		public static char byteToChar(byte[] b) {
			int s = 0;
			for (int i = 0; i < 2; i++) {
				s += (b[i] & 0xFF) << (8 * i);
			}
			char ch = (char) s;
			return ch;
		}

		public static byte[] BoolToByte(boolean ch) {
			byte[] b = new byte[1];
			if (ch) {
				b[0] = 1;
			} else {
				b[0] = 0;
			}
			return b;
		}

		public static boolean byteToBool(byte[] b) {
			if (b[0] == 1) {
				return true;
			} else {
				return false;
			}
		}

		public static byte[] longToByte8(long l) {
			byte[] bt = new byte[8];
			bt[0] = (byte) (0x00l | l);
			bt[1] = (byte) ((0x0000l | l) >> 8);
			bt[2] = (byte) ((0x000000l | l) >> 16);
			bt[3] = (byte) ((0x00000000l | l) >> 24);
			bt[4] = (byte) ((0x0000000000l | l) >> 32 & 0xff);
			bt[5] = (byte) ((0x000000000000l | l) >> 40);
			bt[6] = (byte) ((0x00000000000000l | l) >> 48);
			bt[7] = (byte) ((0x0000000000000000l | l) >> 56);
			return bt;
		}

		public static long byteToLong(byte[] b, int pos) {
			long s = 0;
			long s0 = b[pos] & 0xff;// 最低位
			long s1 = b[pos + 1] & 0xff;
			long s2 = b[pos + 2] & 0xff;
			long s3 = b[pos + 3] & 0xff;
			long s4 = b[pos + 4] & 0xff;// 最低位
			long s5 = b[pos + 5] & 0xff;
			long s6 = b[pos + 6] & 0xff;
			long s7 = b[pos + 7] & 0xff;
			// s0不变
			s1 <<= 8;
			s2 <<= 16;
			s3 <<= 24;
			s4 <<= 8 * 4;
			s5 <<= 8 * 5;
			s6 <<= 8 * 6;
			s7 <<= 8 * 7;
			s = s0 | s1 | s2 | s3 | s4 | s5 | s6 | s7;
			return s;
		}

		public static long byteToLong(byte[] b) {
			long s = 0;
			long s0 = b[0] & 0xff;// 最低位
			long s1 = b[1] & 0xff;
			long s2 = b[2] & 0xff;
			long s3 = b[3] & 0xff;
			long s4 = b[4] & 0xff;// 最低位
			long s5 = b[5] & 0xff;
			long s6 = b[6] & 0xff;
			long s7 = b[7] & 0xff;
			// s0不变
			s1 <<= 8;
			s2 <<= 16;
			s3 <<= 24;
			s4 <<= 8 * 4;
			s5 <<= 8 * 5;
			s6 <<= 8 * 6;
			s7 <<= 8 * 7;
			s = s0 | s1 | s2 | s3 | s4 | s5 | s6 | s7;
			return s;
		}

	}